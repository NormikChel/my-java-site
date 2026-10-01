package com.example;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.LocaleResolver;

import java.util.Locale;

@SpringBootApplication
@Controller
public class Application {

    private final LocaleResolver localeResolver;

    public Application(LocaleResolver localeResolver) {
        this.localeResolver = localeResolver;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @GetMapping("/")
    public String indexRu(HttpServletRequest request, HttpServletResponse response, Model model) {
        localeResolver.setLocale(request, response, Locale.forLanguageTag("ru"));
        model.addAttribute("currentLang", "ru");
        return "index";
    }

    @GetMapping("/en")
    public String indexEn(HttpServletRequest request, HttpServletResponse response, Model model) {
        localeResolver.setLocale(request, response, Locale.forLanguageTag("en"));
        model.addAttribute("currentLang", "en");
        return "index";
    }

    @GetMapping("/zh-CN")
    public String indexZhCN(HttpServletRequest request, HttpServletResponse response, Model model) {
        localeResolver.setLocale(request, response, Locale.forLanguageTag("zh-CN"));
        model.addAttribute("currentLang", "zh-CN");
        return "index";
    }

    @GetMapping("/zh-TW")
    public String indexZhTW(HttpServletRequest request, HttpServletResponse response, Model model) {
        localeResolver.setLocale(request, response, Locale.forLanguageTag("zh-TW"));
        model.addAttribute("currentLang", "zh-TW");
        return "index";
    }

    @GetMapping("/api/status")
    @ResponseBody
    public String status() {
        return "Java-сервер работает отлично! 🚀";
    }
}