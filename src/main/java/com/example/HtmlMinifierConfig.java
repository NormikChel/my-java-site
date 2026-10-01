package com.example;

import com.googlecode.htmlcompressor.compressor.HtmlCompressor;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletResponseWrapper;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

@Configuration
public class HtmlMinifierConfig {

    @Bean
    public FilterRegistrationBean<HtmlMinifierFilter> htmlMinifier() {
        FilterRegistrationBean<HtmlMinifierFilter> reg = new FilterRegistrationBean<>();
        reg.setFilter(new HtmlMinifierFilter());
        reg.addUrlPatterns("/*");
        reg.setOrder(1);
        return reg;
    }

    public static class HtmlMinifierFilter implements Filter {
        private final HtmlCompressor compressor = new HtmlCompressor();

        @Override
        public void init(FilterConfig filterConfig) {
            compressor.setRemoveComments(true);
            compressor.setRemoveMultiSpaces(false);
            compressor.setRemoveIntertagSpaces(true);
            compressor.setRemoveQuotes(false);
            compressor.setSimpleDoctype(true);
            compressor.setPreserveLineBreaks(false);
            compressor.setRemoveSurroundingSpaces("br,p");
            compressor.setCompressCss(true);
            compressor.setCompressJavaScript(true);
        }

        @Override
        public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
                throws IOException, ServletException {
            HttpServletResponse response = (HttpServletResponse) resp;
            CharResponseWrapper wrapper = new CharResponseWrapper(response);

            chain.doFilter(req, wrapper);

            String contentType = response.getContentType();
            if (contentType == null || !contentType.contains("text/html")) {
                response.getWriter().write(wrapper.toString());
                return;
            }

            String original = wrapper.toString();
            String minified;
            try {
                minified = compressor.compress(original);
            } catch (Exception e) {
                minified = original;
            }
            response.setContentLength(minified.getBytes(StandardCharsets.UTF_8).length);
            response.getWriter().write(minified);
        }

        static class CharResponseWrapper extends HttpServletResponseWrapper {
            private final CharArrayWriter writer = new CharArrayWriter();

            CharResponseWrapper(HttpServletResponse response) {
                super(response);
            }

            @Override
            public PrintWriter getWriter() {
                return new PrintWriter(writer);
            }

            @Override
            public String toString() {
                return writer.toString();
            }
        }
    }
}