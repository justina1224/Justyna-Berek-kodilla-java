package com.kodilla.good.patterns.food2Door;

import java.util.*;

public final class FoodOrder {
    private FoodProduct foodProduct;
    private List<ProductWithQuantity> order;
    private boolean processed;


    public FoodOrder(FoodSuplier foodSuplier, boolean processed) {
        this.order = new ArrayList<>();
        this.processed = processed;
        this.foodProduct = foodProduct;
    }

    public List<ProductWithQuantity> getOrder() {
        return order;
    }

    public boolean isProceed() {
        return processed;
    }

    public void addProduct(FoodSuplier foodSuplier, ProductWithQuantity productWithQuantity) {

        if(productWithQuantity.getFoodProduct().isAvailable()) {
            order.add(productWithQuantity);
        } else {
            System.out.println("Out of stock");
        }
    }

    public void removeProduct(ProductWithQuantity productWithQuantity) {
        order.remove(productWithQuantity);
    }

    public double calculatePrice() {

       double price = order.stream()
               .mapToDouble(p -> p.calculatePrice())
               .sum();
       return price;

    }
}