package com.kodilla.testing.shape;

import java.lang.Math;

public class Circle implements Shape {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getField() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String getShapeName() {
        return "circle";
    }
}
