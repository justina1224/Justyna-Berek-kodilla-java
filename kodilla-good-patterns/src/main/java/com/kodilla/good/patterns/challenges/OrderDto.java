package com.kodilla.good.patterns.challenges;

public class OrderDto {
    private Buyer buyer;
    private Order order;
    private boolean orderInProgress;

    public OrderDto(Buyer buyer, Order order, boolean orderInProgress) {
        this.buyer = buyer;
        this.order = order;
        this.orderInProgress = orderInProgress;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public Order getOrder() {
        return order;
    }

    public boolean orderInProgress() {
        return orderInProgress;
    }
}