package com.example;

public class App {

    private Printer printer;

    public App(Printer printer) {
        this.printer = printer;
    }

    public void run() {
        Library library = new Library();

        library.addBook(new Book("1984", "George Orwell", 328));
        library.addBook(new Book("The Hobbit", "J.R.R. Tolkien", 310));
        library.addBook(new Book("Dune", "Frank Herbert", 412));

        printer.print("Number of books: " + library.countBooks());
        printer.print("Total pages: " + library.totalPages());
        printer.print("Contains Dune: " + library.containsTitle("Dune"));
        printer.print("Contains Hamlet: " + library.containsTitle("Hamlet"));
    }

    public static void main(String[] args) {
        Printer printer = new ConsolePrinter();
        App app = new App(printer);
        app.run();
    }
}