package com.kodilla.testing.shape;

public class Triangle implements Shape{

    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getField() {
        return 0.5 * base * height;
    }

    @Override
    public String getShapeName() {
        return "triangle";
    }
}
