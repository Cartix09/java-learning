package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArrayStatsTest {

    @Test
    void maxReturnsLargestValue() {
        ArrayStats stats = new ArrayStats();
        int[] numbers = {10, 25, 3, 18};
        assertEquals(25, stats.max(numbers));
    }

    @Test
    void minReturnsSmallestValue() {
        ArrayStats stats = new ArrayStats();
        int[] numbers = {10, 25, 3, 18};
        assertEquals(3, stats.min(numbers));
    }

    @Test
    void meanCalculatesAverageCorrectly() {
        ArrayStats stats = new ArrayStats();
        int[] numbers = {10, 20, 30};
        assertEquals(20.0, stats.mean(numbers));
    }

    @Test
    void worksForSingleElementArray() {
        ArrayStats stats = new ArrayStats();
        int[] numbers = {7};
        assertEquals(7, stats.max(numbers));
        assertEquals(7, stats.min(numbers));
        assertEquals(7.0, stats.mean(numbers));
    }

    @Test
    void worksForNegativeValues() {
        ArrayStats stats = new ArrayStats();
        int[] numbers = {-10, -3, -25, -7};
        assertEquals(-3, stats.max(numbers));
        assertEquals(-25, stats.min(numbers));
        assertEquals(-11.25, stats.mean(numbers));
    }

    @Test
    void maxThrowsExceptionForEmptyArray() {
        ArrayStats stats = new ArrayStats();
        int[] numbers = {};
        assertThrows(IllegalArgumentException.class, () -> stats.max(numbers));
    }

    @Test
    void minThrowsExceptionForEmptyArray() {
        ArrayStats stats = new ArrayStats();
        int[] numbers = {};
        assertThrows(IllegalArgumentException.class, () -> stats.min(numbers));
    }

    @Test
    void meanThrowsExceptionForEmptyArray() {
        ArrayStats stats = new ArrayStats();
        int[] numbers = {};
        assertThrows(IllegalArgumentException.class, () -> stats.mean(numbers));
    }
}