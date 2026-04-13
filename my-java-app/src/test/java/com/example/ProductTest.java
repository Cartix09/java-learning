package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProductTest {

    @Test
    void productStoresNameCorrectly() {
        Product p = new Product("Book", 10.0);
        assertEquals("Book", p.getName());
    }

    @Test
    void productStoresPriceCorrectly() {
        Product p = new Product("Book", 10.0);
        assertEquals(10.0, p.getPrice());
    }

    @Test
    void negativePriceThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Product("Book", -10);
        });
    }
}