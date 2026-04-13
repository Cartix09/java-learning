package com.example;

public class App {

    private Printer printer;

    public App(Printer printer) {
        this.printer = printer;
    }

    public void run(String[] args) {
        if (args.length == 0) {
            printer.print("Usage: provide numbers");
            return;
        }

        int[] numbers = new int[args.length];

        try {
            for (int i = 0; i < args.length; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }
        } catch (NumberFormatException e) {
            printer.print("Error: invalid number");
            return;
        }

        ArrayStats stats = new ArrayStats();

        printer.print("Max: " + stats.max(numbers));
        printer.print("Min: " + stats.min(numbers));
        printer.print("Mean: " + stats.mean(numbers));
    }

    public static void main(String[] args) {
        Printer printer = new ConsolePrinter();
        App app = new App(printer);
        app.run(args);
    }
}