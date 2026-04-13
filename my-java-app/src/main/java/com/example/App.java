package com.example;

public class App {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java com.example.App <number1> <number2>");
            return;
        }

        int a;
        int b;

        try {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Error: both arguments must be valid integers.");
            return;
        }

        Calculator calculator = new Calculator();

        System.out.println("Sum: " + calculator.sum(a, b));
        System.out.println("Difference: " + calculator.diff(a, b));
        System.out.println("Product: " + calculator.product(a, b));
        System.out.println("Average: " + calculator.average(a, b));
        System.out.println(a + " is even: " + calculator.isEven(a));
        System.out.println(b + " is even: " + calculator.isEven(b));
    }
}