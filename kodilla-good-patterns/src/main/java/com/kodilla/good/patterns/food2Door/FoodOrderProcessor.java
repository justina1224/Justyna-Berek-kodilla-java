package com.kodilla.good.patterns.food2Door;

public class FoodOrderProcessor {

    public FoodOrderProcessor() {}

    public void processOrder(FoodSuplier foodSuplier, FoodOrder foodOrder) {
        foodSuplier.getDetails();
        foodSuplier.process(foodOrder);

        if(foodOrder.isProceed()) {
            System.out.println("Please wait, your order is being processed..");
            System.out.println("Sending confirmation email");
        } else {
            System.out.println("Order cancelled");
        }
    }
}