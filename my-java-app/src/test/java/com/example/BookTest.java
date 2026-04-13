package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BookTest {

    @Test
    void storesTitleCorrectly() {
        Book book = new Book("1984", "George Orwell", 328);
        assertEquals("1984", book.getTitle());
    }

    @Test
    void storesAuthorCorrectly() {
        Book book = new Book("1984", "George Orwell", 328);
        assertEquals("George Orwell", book.getAuthor());
    }

    @Test
    void storesPagesCorrectly() {
        Book book = new Book("1984", "George Orwell", 328);
        assertEquals(328, book.getPages());
    }

    @Test
    void emptyTitleThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Book("", "George Orwell", 328);
        });
    }

    @Test
    void emptyAuthorThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Book("1984", "", 328);
        });
    }

    @Test
    void nonPositivePagesThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Book("1984", "George Orwell", 0);
        });
    }
}