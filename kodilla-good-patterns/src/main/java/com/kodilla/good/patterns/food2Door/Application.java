package com.kodilla.good.patterns.food2Door;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main (String[] args) {
        ExtraFoodShop extraFoodShop = new ExtraFoodShop("ExtraFoodShop", "Warszawa, Ochota", 6.00);
        List<FoodProduct> listOfProducts = new ArrayList<>();

        FoodProduct product1 =  new FoodProduct("bread", extraFoodShop, "3456", 10.99,true);
        FoodProduct product2 =  new FoodProduct("milk", extraFoodShop, "3458", 8.99, true);

        extraFoodShop.addItemToList(listOfProducts, product1);
        extraFoodShop.addItemToList(listOfProducts, product2);

        ProductWithQuantity quantityProduct1 = new ProductWithQuantity(product1, 2);
        ProductWithQuantity quantityProduct2 = new ProductWithQuantity(product2, 2);

        FoodOrder foodOrder = new FoodOrder(extraFoodShop, true);

        foodOrder.addProduct(extraFoodShop, quantityProduct1);
        foodOrder.addProduct(extraFoodShop, quantityProduct2);
        FoodOrderProcessor orderProcessor = new FoodOrderProcessor();
        orderProcessor.processOrder(extraFoodShop, foodOrder);

    }
}
