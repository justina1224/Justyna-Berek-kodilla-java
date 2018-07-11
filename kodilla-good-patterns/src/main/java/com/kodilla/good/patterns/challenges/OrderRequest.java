package com.kodilla.good.patterns.challenges;

import java.util.List;

public class OrderRequest {
    private Buyer buyer;
    private Order order;
    private double totalPrice;

    public OrderRequest(Buyer buyer, Order order, double totalPrice) {
        this.buyer = buyer;
        this.order = order;
        this.totalPrice = order.calculatePrice();
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public Order getOrder() {
        return order;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public List<Product> getList() {
        return this.order.getBasket();
    }

    public double getPriceWithShippingFee(Delivery delivery) {
        return this.totalPrice + delivery.getAdditionalFee();
    }
}