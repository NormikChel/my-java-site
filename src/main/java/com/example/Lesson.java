package com.example;

import java.util.Locale;
import java.util.Map;

public record Lesson(
    String slug,
    String emoji,
    Map<String, String> titles,
    Map<String, String> subtitles,
    Map<String, String> contents
) {
    public String getTitle(Locale locale) {
        return titles.getOrDefault(key(locale), titles.get("en"));
    }

    public String getSubtitle(Locale locale) {
        return subtitles.getOrDefault(key(locale), subtitles.get("en"));
    }

    public String getContent(Locale locale) {
        return contents.getOrDefault(key(locale), contents.get("en"));
    }

    private String key(Locale locale) {
        if (locale == null) return "en";
        String lang = locale.getLanguage();
        String country = locale.getCountry();
        if ("zh".equals(lang)) {
            return "CN".equals(country) ? "zh_CN" : "zh_TW";
        }
        if ("uk".equals(lang)) return "uk";
        if ("ru".equals(lang)) return "ru";
        return "en";
    }
}