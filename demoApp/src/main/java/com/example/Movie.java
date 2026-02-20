package com.example;

public class Movie {
    public Movie(String title, int id) {
        this.title = title;
        this.id = id;
    }

    private int id;
    private String title;

    public Movie() {

    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(int id) {
        this.id = id;
    }
}
