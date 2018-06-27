package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> collection = new ArrayList<>();


    public ShapeCollector() {}

    public void addFigure(Shape shape) {
        collection.add(shape);
    }

    public void removeFigure(Shape shape) {
        collection.remove(shape);
    }

    public void getFigure(int n) {
        collection.get(n);
    }

    public Shape[] showFigures() {

        Shape[] shapes = new Shape[collection.size()];
        return collection.toArray(shapes);

    }
}
