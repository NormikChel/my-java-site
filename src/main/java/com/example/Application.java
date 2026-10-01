package com.example;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.LocaleResolver;

import java.util.Locale;

@SpringBootApplication
@Controller
public class Application {

    private final LocaleResolver localeResolver;
    private final LessonService lessonService;

    public Application(LocaleResolver localeResolver, LessonService lessonService) {
        this.localeResolver = localeResolver;
        this.lessonService = lessonService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    // --- Главная ---

    @GetMapping("/")
    public String homeRu(HttpServletRequest req, HttpServletResponse res, Model model) {
        localeResolver.setLocale(req, res, Locale.forLanguageTag("ru"));
        model.addAttribute("currentLang", "ru");
        return "index";
    }

    @GetMapping("/en")
    public String homeEn(HttpServletRequest req, HttpServletResponse res, Model model) {
        localeResolver.setLocale(req, res, Locale.forLanguageTag("en"));
        model.addAttribute("currentLang", "en");
        return "index";
    }

    @GetMapping("/zh-CN")
    public String homeCn(HttpServletRequest req, HttpServletResponse res, Model model) {
        localeResolver.setLocale(req, res, Locale.forLanguageTag("zh-CN"));
        model.addAttribute("currentLang", "zh-CN");
        return "index";
    }

    @GetMapping("/zh-TW")
    public String homeTw(HttpServletRequest req, HttpServletResponse res, Model model) {
        localeResolver.setLocale(req, res, Locale.forLanguageTag("zh-TW"));
        model.addAttribute("currentLang", "zh-TW");
        return "index";
    }

    @GetMapping("/uk")
    public String homeUk(HttpServletRequest req, HttpServletResponse res, Model model) {
        localeResolver.setLocale(req, res, Locale.forLanguageTag("uk"));
        model.addAttribute("currentLang", "uk");
        return "index";
    }

    // --- Гайд (список) ---

    @GetMapping("/guide")
    public String guideRu(HttpServletRequest req, HttpServletResponse res, Model model) {
        localeResolver.setLocale(req, res, Locale.forLanguageTag("ru"));
        model.addAttribute("currentLang", "ru");
        model.addAttribute("lessons", lessonService.getAll());
        model.addAttribute("locale", Locale.forLanguageTag("ru"));
        return "guide";
    }

    @GetMapping("/en/guide")
    public String guideEn(HttpServletRequest req, HttpServletResponse res, Model model) {
        localeResolver.setLocale(req, res, Locale.forLanguageTag("en"));
        model.addAttribute("currentLang", "en");
        model.addAttribute("lessons", lessonService.getAll());
        model.addAttribute("locale", Locale.forLanguageTag("en"));
        return "guide";
    }

    @GetMapping("/uk/guide")
    public String guideUk(HttpServletRequest req, HttpServletResponse res, Model model) {
        localeResolver.setLocale(req, res, Locale.forLanguageTag("uk"));
        model.addAttribute("currentLang", "uk");
        model.addAttribute("lessons", lessonService.getAll());
        model.addAttribute("locale", Locale.forLanguageTag("uk"));
        return "guide";
    }

    // --- Один урок ---

    @GetMapping("/guide/{slug}")
    public String lessonRu(@PathVariable String slug, HttpServletRequest req, HttpServletResponse res, Model model) {
        localeResolver.setLocale(req, res, Locale.forLanguageTag("ru"));
        var lesson = lessonService.findBySlug(slug).orElse(null);
        if (lesson == null) return "redirect:/guide";
        model.addAttribute("currentLang", "ru");
        model.addAttribute("lesson", lesson);
        model.addAttribute("locale", Locale.forLanguageTag("ru"));
        return "lesson";
    }

    @GetMapping("/en/guide/{slug}")
    public String lessonEn(@PathVariable String slug, HttpServletRequest req, HttpServletResponse res, Model model) {
        localeResolver.setLocale(req, res, Locale.forLanguageTag("en"));
        var lesson = lessonService.findBySlug(slug).orElse(null);
        if (lesson == null) return "redirect:/en/guide";
        model.addAttribute("currentLang", "en");
        model.addAttribute("lesson", lesson);
        model.addAttribute("locale", Locale.forLanguageTag("en"));
        return "lesson";
    }

    @GetMapping("/uk/guide/{slug}")
    public String lessonUk(@PathVariable String slug, HttpServletRequest req, HttpServletResponse res, Model model) {
        localeResolver.setLocale(req, res, Locale.forLanguageTag("uk"));
        var lesson = lessonService.findBySlug(slug).orElse(null);
        if (lesson == null) return "redirect:/uk/guide";
        model.addAttribute("currentLang", "uk");
        model.addAttribute("lesson", lesson);
        model.addAttribute("locale", Locale.forLanguageTag("uk"));
        return "lesson";
    }