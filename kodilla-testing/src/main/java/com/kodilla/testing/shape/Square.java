package com.kodilla.testing.shape;

import java.util.Objects;

import static java.lang.Math.pow;

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
        return pow(lengthOfSide, 2);
    }
}
