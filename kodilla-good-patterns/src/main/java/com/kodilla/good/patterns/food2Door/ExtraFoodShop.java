package com.kodilla.good.patterns.food2Door;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop implements FoodSuplier {
    private String suplierName;
    private String location;
    private List<FoodProduct> listOfProducts;
    private double distance;

    public ExtraFoodShop(String suplierName, String location, double distance) {
        this.suplierName = suplierName;
        this.location = location;
        this.listOfProducts = new ArrayList<>();
        this.distance = distance;
    }

    public String getSuplierName() {
        return suplierName;
    }

    public String getLocation() {
        return location;
    }

    public List<FoodProduct> getListOfProducts() {
        return listOfProducts;
    }

    public double getDistance() {
        return distance;
    }

    @Override
    public void getDetails() {
        System.out.println("Producent name: " + getSuplierName() + ", Location: " + getLocation());
    }

    @Override
    public void process(FoodOrder foodOrder) {

        System.out.println("Thank you for choosing " + getSuplierName() + "!");
        System.out.println("Products in basket: " + foodOrder.getOrder());

         if(distance <= 5.00) {
             System.out.println("Free delivery");
             System.out.println("Total price: " + (foodOrder.calculatePrice()));
         } else {
             double additionalFee = 4.99;
             System.out.println("Additional delivery fee: " + additionalFee);
             System.out.println("Total price calculating: " + foodOrder.calculatePrice() + " + " + additionalFee +  " = " +
                     (foodOrder.calculatePrice() + additionalFee));
         }
    }

    public void addItemToList (List listOfProducts, FoodProduct foodProduct) {
        listOfProducts.add(foodProduct);
    }

}
