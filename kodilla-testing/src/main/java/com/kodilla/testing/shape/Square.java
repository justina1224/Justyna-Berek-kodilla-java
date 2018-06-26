package com.kodilla.testing.shape;

import java.util.Objects;

import static java.lang.Math.*;

public class Square implements Shape {

    double lengthOfSide;

    public Square(double lengthOfSide) {
        this.lengthOfSide = lengthOfSide;
    }

    @Override
    public double getField() {
        return pow(lengthOfSide, 2);
    }

    @Override
    public String getShapeName() {
        return "square";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        Square square = (Square) o;
        return Double.compare(square.lengthOfSide, lengthOfSide) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(lengthOfSide);
    }
}
