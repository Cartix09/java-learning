package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CalculatorTest {

    @Test
    void sumAddsTwoNumbersCorrectly() {
        Calculator c = new Calculator();
        assertEquals(35, c.sum(10, 25));
    }

    @Test
    void diffSubtractsTwoNumbersCorrectly() {
        Calculator c = new Calculator();
        assertEquals(-15, c.diff(10, 25));
    }

    @Test
    void productMultipliesTwoNumbersCorrectly() {
        Calculator c = new Calculator();
        assertEquals(250, c.product(10, 25));
    }

    @Test
    void averageCalculatesCorrectly() {
        Calculator c = new Calculator();
        assertEquals(17.5, c.average(10, 25));
    }

    @Test
    void isEvenReturnsTrueForEvenNumber() {
        Calculator c = new Calculator();
        assertTrue(c.isEven(10));
    }

    @Test
    void isEvenReturnsFalseForOddNumber() {
        Calculator c = new Calculator();
        assertFalse(c.isEven(7));
    }
}