package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public final class Order {
    private final String numberOfOrder;
    private final LocalDate dateOfOrder;
    private final List<Product> basket;
    private Product product;

    public Order(String numberOfOrder, int year, int month, int dayOfMonth) {
        this.numberOfOrder = numberOfOrder;
        this.dateOfOrder = LocalDate.of(year, month, dayOfMonth);
        this.basket = new ArrayList<Product>();
        this.product = product;
    }

    public String getNumberOfOrder() {
        return numberOfOrder;
    }

    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }

    public List<Product> getBasket() {
        return basket;
    }

    public Product getProduct() {
        return product;
    }

    public void addToBasket(Product product) {

        if(product.isAvailable()) {

            basket.add(product);

        } else {
            System.out.println("Out of stock");
        }
    }

    public double calculatePrice() {

        List<Double> totalList = basket.stream()
                .map(p -> p.getPrice())
                .collect(Collectors.toList());

        double total = IntStream.range(0, totalList.size())
                .mapToDouble(p -> (totalList.get(p)))
                .sum();

        return total;
    }
}