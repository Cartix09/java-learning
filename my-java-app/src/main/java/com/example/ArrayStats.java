package com.example;

public class ArrayStats {

    public int max(int[] a) {
        int maxValue = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > maxValue) {
                maxValue = a[i];
            }
        }

        return maxValue;
    }

    public int min(int[] a) {
        int minValue = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] < minValue) {
                minValue = a[i];
            }
        }

        return minValue;
    }

    public double mean(int[] a) {
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        return (double) sum / a.length;
    }
}