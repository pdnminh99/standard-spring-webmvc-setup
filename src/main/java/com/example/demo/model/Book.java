package com.example.demo.model;

public class Book {
    public String title;

    public String author;

    public Integer year;

    public Book() {
        System.out.println("Attempt to create new book object.");
    }

    public Integer getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
