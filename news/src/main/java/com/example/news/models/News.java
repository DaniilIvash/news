package com.example.news.models;

public class News {
    private int id;
    private String title;
    private String text;
    private String category;
    private String author;
    private String date;

    public News(int id, String title, String text, String category, String author, String date) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.category = category;
        this.author = author;
        this.date = date;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getText() { return text; }
    public String getCategory() { return category; }
    public String getAuthor() { return author; }
    public String getDate() { return date; }
}
