package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {
    double base;
    double height;

    public Triangle( double base, double height) {

        this.base = base;
        this.height = height;
    }

    @Override

    public String getShapeName() {
        return "triangle";
    }

    @Override
    public double getField() {
        return 0.5 * base * height;
    }

}
