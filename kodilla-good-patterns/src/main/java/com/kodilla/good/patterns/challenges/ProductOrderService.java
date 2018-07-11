package com.kodilla.good.patterns.challenges;

public class ProductOrderService implements OrderService{

    @Override
    public boolean orderCreated(final OrderRequest orderRequest) {
        System.out.println("New order created on " +
                        orderRequest.getOrder().getDateOfOrder().getDayOfMonth() + " " +
                        orderRequest.getOrder().getDateOfOrder().getMonth() + " " +
                        orderRequest.getOrder().getDateOfOrder().getYear() +
                ", Order reference: " + orderRequest.getOrder().getNumberOfOrder() +
                ", Buyer name: " + orderRequest.getBuyer().getBuyerName() +
                ",\nNumber of products in basket:" + orderRequest.getList().size()+ " " + orderRequest.getList() +
                ",\nTotal price: " + orderRequest.getTotalPrice());

        return true;
    }
}
