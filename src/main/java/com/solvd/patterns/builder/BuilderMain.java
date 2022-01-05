package com.solvd.patterns.builder;

import org.joda.time.LocalDate;

/*
Данный паттерн удобно использовать при создании объекта
с больши количество полей, когда не все они обязательные
Так код становится более читабельным
 */

public class BuilderMain {

    public static void main(String[] args) {
        Page solvd = Page.builder()
                .title("Solvd.｜Software Development & QA Company")
                .description("is an international software engineering company focused on Mobile and Web solutions")
                .size(150)
                .build();

        Page google = Page.builder()
                .title("Google")
                .description("Search the world's information, including webpages, images, videos and more")
                .creationDate(LocalDate.parse("1997-01-31"))
                .build();
    }
}
