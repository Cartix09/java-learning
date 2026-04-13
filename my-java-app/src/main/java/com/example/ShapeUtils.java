package com.example;

import java.util.List;

public class ShapeUtils {

    public static double totalArea(List<Shape> shapes) {
        double sum = 0.0;

        for (Shape s : shapes) {
            sum += s.area();
        }

        return sum;
    }
}