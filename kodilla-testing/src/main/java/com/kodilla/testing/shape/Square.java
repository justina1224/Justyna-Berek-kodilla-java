package com.kodilla.testing.shape;

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
}
