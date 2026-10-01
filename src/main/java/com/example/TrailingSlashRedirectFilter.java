package com.example;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
@Order(1)
public class TrailingSlashRedirectFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain chain)
            throws ServletException, IOException {

        String path = request.getRequestURI();
        String ctx = request.getContextPath();
        String query = request.getQueryString();

        // /en/ → /en, /guide/ → /guide, /en/guide/ → /en/guide
        // НЕ трогаем корень "/" и статику
        if (path.length() > 1 && path.endsWith("/")) {
            String newPath = path.substring(0, path.length() - 1);
            String redirect = newPath + (query != null && !query.isEmpty() ? "?" + query : "");

            response.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY); // 301
            response.setHeader("Location", redirect);
            return;
        }

        chain.doFilter(request, response);
    }
}