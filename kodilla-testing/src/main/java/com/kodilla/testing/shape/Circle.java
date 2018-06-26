package com.kodilla.testing.shape;

import java.lang.Math;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(radius);
    }
}
