package com.example;

public class App {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java com.example.App <number1> <number2> ...");
            return;
        }

        int[] numbers = new int[args.length];

        try {
            for (int i = 0; i < args.length; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: all arguments must be valid integers.");
            return;
        }

        ArrayStats stats = new ArrayStats();

        System.out.println("Max: " + stats.max(numbers));
        System.out.println("Min: " + stats.min(numbers));
        System.out.println("Mean: " + stats.mean(numbers));
    }
}