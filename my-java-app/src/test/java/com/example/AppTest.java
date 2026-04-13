package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class FakePrinter implements Printer {
    StringBuilder output = new StringBuilder();

    @Override
    public void print(String s) {
        output.append(s).append("\n");
    }

    public String getOutput() {
        return output.toString();
    }
}

public class AppTest {

    @Test
    void appPrintsLibrarySummary() {
        FakePrinter printer = new FakePrinter();
        App app = new App(printer);

        app.run();

        String output = printer.getOutput();

        assertTrue(output.contains("Number of books: 3"));
        assertTrue(output.contains("Total pages: 1050"));
        assertTrue(output.contains("Contains Dune: true"));
        assertTrue(output.contains("Contains Hamlet: false"));
    }
}