package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> collection = new ArrayList<>();

    public ShapeCollector() {
    }

    public void addFigure(Shape shape) {
        collection.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if(collection.contains(shape)) {
            collection.remove(shape);
            result = true;
        }
        return result;
    }

    public void getFigure ( int n){
        collection.get(n);
    }

    public Shape[] showFigures() {
        Shape[] shapes = new Shape[collection.size()];
        return collection.toArray(shapes);
    }
}
