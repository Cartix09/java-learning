package com.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeTest {

    @Test
    void circleAreaIsCorrect() {
        Circle c = new Circle(1);
        assertEquals(Math.PI, c.area(), 0.0001);
    }

    @Test
    void rectangleAreaIsCorrect() {
        Rectangle r = new Rectangle(4, 5);
        assertEquals(20.0, r.area());
    }

    @Test
    void totalAreaWorksForMultipleShapes() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(1));      // π ≈ 3.1415
        shapes.add(new Rectangle(4, 5)); // 20

        double total = ShapeUtils.totalArea(shapes);

        assertEquals(23.1415, total, 0.01);
    }
}