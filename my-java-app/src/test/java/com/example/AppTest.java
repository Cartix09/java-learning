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
    void appPrintsStatsCorrectly() {
        FakePrinter printer = new FakePrinter();
        App app = new App(printer);

        String[] args = {"10", "20", "30"};
        app.run(args);

        String output = printer.getOutput();

        assertTrue(output.contains("Max: 30"));
        assertTrue(output.contains("Min: 10"));
        assertTrue(output.contains("Mean: 20.0"));
    }
}