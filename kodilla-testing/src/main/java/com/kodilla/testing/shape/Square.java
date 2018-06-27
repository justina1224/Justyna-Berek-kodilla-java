package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape{
    double lengthOfSide;

    public Square( double lengthOfSide) {
        this.lengthOfSide = lengthOfSide;
    }

    @Override
    public String getShapeName() {
        return "square";
    }

    @Override
    public double getField() {
        return Math.pow(lengthOfSide, 2);
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
