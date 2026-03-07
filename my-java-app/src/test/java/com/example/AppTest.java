package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void greeterProducesExpectedMessage() {
        Greeter g = new Greeter("Hi");
        assertEquals("Hi, Ada!", g.greet("Ada"));
    }
}