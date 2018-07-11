package com.kodilla.good.patterns.challenges;

public class OrderRequestsRetriever {
    public OrderRequest retrieve() {
        Buyer buyer1 = new Buyer("olga26", "Olga Michta");
        Order order1 = new Order("QV12133", 2018, 07, 06);
        order1.addToBasket(new Product("table", "furniture", "2345", 129.99, true));
        order1.addToBasket(new Product("chair", "furniture", "2340", 69.99, true));
        order1.addToBasket(new Product("chair", "furniture", "2340", 69.99, true));

        return new OrderRequest(buyer1, order1, order1.calculatePrice());
    }
}
