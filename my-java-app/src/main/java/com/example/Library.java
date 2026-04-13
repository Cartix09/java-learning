package com.example;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Book cannot be null.");
        }
        books.add(book);
    }

    public int countBooks() {
        return books.size();
    }

    public int totalPages() {
        int sum = 0;

        for (Book book : books) {
            sum += book.getPages();
        }

        return sum;
    }

    public boolean containsTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }
        return false;
    }

    public List<Book> getBooks() {
        return books;
    }
}