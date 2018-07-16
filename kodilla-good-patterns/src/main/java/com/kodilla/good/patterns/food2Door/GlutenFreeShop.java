package com.kodilla.good.patterns.food2Door;

import java.util.ArrayList;
import java.util.List;

public class GlutenFreeShop implements FoodSuplier{
    private String suplierName;
    private String location;
    private List<FoodProduct> listOfProducts;
    private FoodOrder foodOrder;

    public GlutenFreeShop(String suplierName, String location) {
        this.suplierName = suplierName;
        this.location = location;
        this.listOfProducts = new ArrayList<FoodProduct>();
    }

    public String getSuplierName() {
        return suplierName;
    }

    public String getLocation() {
        return location;
    }

    public List<FoodProduct> getListOfProduct() {
        return listOfProducts;
    }

    @Override
    public void getDetails() {
        System.out.println("Producent name: " + getSuplierName() + ", Location : " + getLocation());
    }

    @Override
    public void process(FoodOrder foodOrder) {
        System.out.println("Thanks for your order, we hope you will be pleased with our products.");
        System.out.println("Products in basket: " + foodOrder.getOrder());
        System.out.println(foodOrder.calculatePrice());
    }

    public void addItemToList (List listOfProducts, FoodProduct foodProduct) {
        listOfProducts.add(foodProduct);
    }
}
