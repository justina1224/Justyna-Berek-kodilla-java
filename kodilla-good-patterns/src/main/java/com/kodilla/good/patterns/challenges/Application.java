package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main (String[] args) {
        OrderRequestsRetriever retriever = new OrderRequestsRetriever();
        OrderRequest orderRequest = retriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new ProductOrderService(), new MailInformationService(), new InPostDelivery(),
                new CardPayment(), new ProductOrderRepository());

        orderProcessor.process(orderRequest);


    }
}
