package com.kodilla.good.patterns.challenges;

public class CardPayment implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Paying by card");
    }
}
