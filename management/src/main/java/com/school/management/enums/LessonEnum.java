package com.school.management.enums;

public enum LessonEnum {
    CHEMISTRY("chemistry lesson"),
    BIOLOGY("bio lesson"),
    MATH("math lesson"),
    MUSIC("music lesson");

    private final String lesson;

    LessonEnum(final String lesson) {
        this.lesson = lesson;
    }

    public String getLesson() {
        return this.name(); //+ " - " + lesson;
    }

}
