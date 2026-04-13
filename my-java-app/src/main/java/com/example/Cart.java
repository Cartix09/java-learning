package com.example;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Product> products;

    public Cart() {
        products = new ArrayList<>();
    }

    public void add(Product p) {
        products.add(p);
    }

    public double total() {
        double sum = 0.0;

        for (Product p : products) {
            sum += p.getPrice();
        }

        return sum;
    }
}