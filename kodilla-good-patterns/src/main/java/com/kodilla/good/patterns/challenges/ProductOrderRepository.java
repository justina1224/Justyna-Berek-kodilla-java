package com.kodilla.good.patterns.challenges;

public class ProductOrderRepository implements OrderRepository {
    @Override
    public boolean create(Order order, Buyer buyer) {
        return true;
    }
}
