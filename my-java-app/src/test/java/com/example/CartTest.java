package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartTest {

    @Test
    void emptyCartHasZeroTotal() {
        Cart cart = new Cart();
        assertEquals(0.0, cart.total());
    }

    @Test
    void cartCalculatesTotalForMultipleProducts() {
        Cart cart = new Cart();
        cart.add(new Product("Book", 10.0));
        cart.add(new Product("Pen", 5.5));
        cart.add(new Product("Notebook", 7.5));

        assertEquals(23.0, cart.total());
    }

    @Test
    void cartWorksWithSingleProduct() {
        Cart cart = new Cart();
        cart.add(new Product("Book", 12.0));

        assertEquals(12.0, cart.total());
    }
}