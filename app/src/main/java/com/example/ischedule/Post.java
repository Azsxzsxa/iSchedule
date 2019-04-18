package com.example.ischedule;

public class Post {

    private String title, content;
    private Boolean completed;

    public Post() {

    }

    public Post(String title, String content, Boolean completed) {
        this.title = title;
        this.content = content;
        this.completed = completed;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
