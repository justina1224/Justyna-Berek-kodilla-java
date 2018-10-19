package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class HawaiPizzaOrder implements PizzaOrder {
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(25);
    }

    @Override
    public String getDescription() {
        return "New order: Hawai Pizza (cheese, tomato sauce, ham, pinaple) ";
    }
}
