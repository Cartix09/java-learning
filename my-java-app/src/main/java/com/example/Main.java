package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Enter your name (type 'exit' to quit): ");

            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("exit")) {
                System.out.println("Program terminated.");
                break;
            }

            System.out.println("Hello, " + name + "!");
        }

        scanner.close();
    }
}