package com.kodilla.good.patterns.food2Door;

import java.util.Objects;

public class FoodProduct {
    private String nameOfProduct;
    private FoodSuplier suplier;
    private String productId;
    private double price;
    private boolean isAvailable;

    public FoodProduct(String nameOfProduct, FoodSuplier suplier, String productId, double price, boolean isAvailable) {
        this.nameOfProduct = nameOfProduct;
        this.suplier = suplier;
        this.productId = productId;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public FoodSuplier getSuplier() {
        return suplier;
    }

    public String getProductId() {
        return productId;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FoodProduct)) return false;
        FoodProduct that = (FoodProduct) o;
        return Double.compare(that.price, price) == 0 &&
                Objects.equals(nameOfProduct, that.nameOfProduct) &&
                Objects.equals(productId, that.productId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nameOfProduct, productId, price);
    }

    @Override
    public String toString() {
        return nameOfProduct + ", productId: " + productId + ", price:" + price + '}';
    }
}
