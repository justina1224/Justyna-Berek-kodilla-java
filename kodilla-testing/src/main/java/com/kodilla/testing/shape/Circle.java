package com.kodilla.testing.shape;


import java.util.Objects;

public class Circle implements Shape {
    double radius;

    public Circle( double radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return "circle";
    }

    @Override
    public double getField() {
        return Math.PI * Math.pow(radius, 2);

    }
}
