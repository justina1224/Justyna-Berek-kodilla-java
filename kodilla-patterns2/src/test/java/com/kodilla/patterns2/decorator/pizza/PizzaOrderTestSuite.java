package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testHawaiPizzaOrderLargeSizeWithExtraDrinkGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new HawaiPizzaOrder();
        pizzaOrder = new LargeSizeDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new PepsiDrinkDecorator(pizzaOrder);
        System.out.println(pizzaOrder.getDescription());

        //When
        String description = pizzaOrder.getDescription();

        //Then
        assertEquals("New order: Hawai Pizza (cheese, tomato sauce, ham, pinaple) large size + extra cheese + Pepsi 0,5l ", description);
    }

    @Test
    public void testHawaiPizzaOrderLargeSizeWithExtraDrinkGetPrice() {
        //Given
        PizzaOrder pizzaOrder = new HawaiPizzaOrder();
        pizzaOrder = new LargeSizeDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new PepsiDrinkDecorator(pizzaOrder);
        System.out.println("Total price: " + pizzaOrder.getCost());

        //When
        BigDecimal price = pizzaOrder.getCost();

        //Then
        assertEquals(new BigDecimal(43.00), price);
    }

    @Test
    public void testBasicPizzaOrderMediumSizeWithMushroomsAndExtraDrinkGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new MediumSizeDecorator(pizzaOrder);
        pizzaOrder = new MushroomsDecorator(pizzaOrder);
        pizzaOrder = new PepsiDrinkDecorator(pizzaOrder);
        System.out.println(pizzaOrder.getDescription());

        //When
        String description = pizzaOrder.getDescription();

        //Then
        assertEquals("New order: Margherita (cheese, tomato sauce) medium size + mushrooms + Pepsi 0,5l ", description);
    }

    @Test
    public void testBasicPizzaOrderMediumSizeWithMushroomsAndExtraDrinkGetPrice() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new MediumSizeDecorator(pizzaOrder);
        pizzaOrder = new MushroomsDecorator(pizzaOrder);
        pizzaOrder = new PepsiDrinkDecorator(pizzaOrder);
        System.out.println("Total price: " + pizzaOrder.getCost());

        //When
        BigDecimal price = pizzaOrder.getCost();

        //Then
        assertEquals(new BigDecimal(31.00), price);
    }
}
