package com.kodilla.good.patterns.challenges;

public interface OrderRepository {
    public boolean create(Order order, Buyer buyer);
}
