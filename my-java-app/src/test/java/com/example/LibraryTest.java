package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LibraryTest {

    @Test
    void emptyLibraryHasZeroBooks() {
        Library library = new Library();
        assertEquals(0, library.countBooks());
    }

    @Test
    void addingBookIncreasesCount() {
        Library library = new Library();
        library.addBook(new Book("1984", "George Orwell", 328));
        assertEquals(1, library.countBooks());
    }

    @Test
    void totalPagesIsCalculatedCorrectly() {
        Library library = new Library();
        library.addBook(new Book("1984", "George Orwell", 328));
        library.addBook(new Book("Dune", "Frank Herbert", 412));
        assertEquals(740, library.totalPages());
    }

    @Test
    void containsTitleReturnsTrueWhenBookExists() {
        Library library = new Library();
        library.addBook(new Book("Dune", "Frank Herbert", 412));
        assertTrue(library.containsTitle("Dune"));
    }

    @Test
    void containsTitleReturnsFalseWhenBookDoesNotExist() {
        Library library = new Library();
        library.addBook(new Book("Dune", "Frank Herbert", 412));
        assertFalse(library.containsTitle("Hamlet"));
    }

    @Test
    void addNullBookThrowsException() {
        Library library = new Library();
        assertThrows(IllegalArgumentException.class, () -> {
            library.addBook(null);
        });
    }
}