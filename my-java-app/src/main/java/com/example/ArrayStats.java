package com.example;

public class ArrayStats {

    public int max(int[] a) {
        if (a.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty.");
        }

        int maxValue = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > maxValue) {
                maxValue = a[i];
            }
        }

        return maxValue;
    }

    public int min(int[] a) {
        if (a.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty.");
        }

        int minValue = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] < minValue) {
                minValue = a[i];
            }
        }

        return minValue;
    }

    public double mean(int[] a) {
        if (a.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty.");
        }

        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        return (double) sum / a.length;
    }
}