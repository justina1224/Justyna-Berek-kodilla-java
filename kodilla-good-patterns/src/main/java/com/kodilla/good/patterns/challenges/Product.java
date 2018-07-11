package com.kodilla.good.patterns.challenges;

public class Product {
    private String nameOfProduct;
    private String category;
    private String productId;
    private double price;
    private boolean isAvailable;

    public Product(String nameOfProduct, String category, String productId, double price, boolean isAvailable) {
        this.nameOfProduct = nameOfProduct;
        this.category = category;
        this.productId = productId;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public String getCategory() {
        return category;
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
    public String toString() {
        return "{" + nameOfProduct + ", productId: " + productId + ", price:" + price + '}';
    }
}
