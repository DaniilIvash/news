package com.example.news.models;

public class Comment {
    private int id;
    private int newsId;
    private String userId;
    private String userName;
    private String text;
    private String date;

    public Comment(int id, int newsId, String userId, String userName, String text, String date) {
        this.id = id;
        this.newsId = newsId;
        this.userId = userId;
        this.userName = userName;
        this.text = text;
        this.date = date;
    }

    // Геттеры
    public int getId() { return id; }
    public int getNewsId() { return newsId; }
    public String getUserId() { return userId; }
    public String getUserName() { return userName; }
    public String getText() { return text; }
    public String getDate() { return date; }
}
