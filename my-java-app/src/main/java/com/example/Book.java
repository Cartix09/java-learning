package com.example;

public class Book {

    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be empty.");
        }
        if (author == null || author.isBlank()) {
            throw new IllegalArgumentException("Author cannot be empty.");
        }
        if (pages <= 0) {
            throw new IllegalArgumentException("Pages must be positive.");
        }

        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }
}