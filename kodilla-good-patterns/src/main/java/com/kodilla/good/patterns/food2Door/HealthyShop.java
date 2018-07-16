package com.kodilla.good.patterns.food2Door;

import java.util.ArrayList;
import java.util.List;

public class HealthyShop  implements FoodSuplier {
    private String suplierName;
    private String location;
    private List<FoodProduct> listOfProducts;
    private FoodOrder foodOrder;

    public HealthyShop(String suplierName, String headQuarters) {
        this.suplierName = suplierName;
        this.location = headQuarters;
        this.listOfProducts = new ArrayList<FoodProduct>();
    }

    public String getSuplierName() {
        return suplierName;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public void getDetails() {
        System.out.println("Producent name: " + getSuplierName() + ", Location : " + getLocation());
    }

    public List<FoodProduct> getListOfProducts() {
        return listOfProducts;
    }

    @Override
    public void process(FoodOrder foodOrder) {
        System.out.println("Thank you for choosing Healthy Shop! " +
                        "When you spend more than 100.00 you can get a 10% discount for your next shopping");
        System.out.println("Products in basket: " + foodOrder.getOrder());
        foodOrder.calculatePrice();
    }
    public void addItemToList (List listOfProducts, FoodProduct foodProduct) {
        listOfProducts.add(foodProduct);
    }
}

