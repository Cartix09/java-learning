package com.example;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println("Sum: " + calculator.sum(a, b));
        System.out.println("Difference: " + calculator.diff(a, b));
        System.out.println("Product: " + calculator.product(a, b));
        System.out.println("Average: " + calculator.average(a, b));
    }
}