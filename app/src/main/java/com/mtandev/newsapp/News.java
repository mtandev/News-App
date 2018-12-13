package com.mtandev.newsapp;

public class News {

    private String title;
    private String category;
    private String date;
    private String url;
    private String author;

    public News(String title, String category, String date, String url, String author) {
        this.title = title;
        this.category = category;
        this.date = date;
        this.url = url;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDate() {
        return date;
    }

    public String getUrl() {
        return url;
    }

    public String getAuthor() {
        return author;
    }
}
