package com.kodilla.good.patterns.food2Door;

public class ProductWithQuantity {
    private FoodProduct foodProduct;
    private double quantity;

    public ProductWithQuantity(FoodProduct foodProduct, double quantity) {
        this.foodProduct = foodProduct;
        this.quantity = quantity;
    }

    public FoodProduct getFoodProduct() {
        return foodProduct;
    }

    public double getQuantity() {
        return quantity;
    }

    public double calculatePrice() {
        return foodProduct.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return  ("{Product: " + foodProduct +
                ", quantity: " + quantity + "}");
    }
}
