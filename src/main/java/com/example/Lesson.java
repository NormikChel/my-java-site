package com.example;

import java.util.Locale;

public record Lesson(
    String slug,
    String emoji,
    String titleRu,
    String titleEn,
    String subtitleRu,
    String subtitleEn,
    String contentRu,
    String contentEn
) {
    public String getTitle(Locale locale) {
        return isEn(locale) ? titleEn : titleRu;
    }

    public String getSubtitle(Locale locale) {
        return isEn(locale) ? subtitleEn : subtitleRu;
    }

    public String getContent(Locale locale) {
        return isEn(locale) ? contentEn : contentRu;
    }

    private boolean isEn(Locale locale) {
        return locale != null && "en".equals(locale.getLanguage());
    }
}