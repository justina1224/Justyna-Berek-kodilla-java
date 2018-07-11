package com.kodilla.good.patterns.challenges;

public class InPostDelivery implements Delivery {
    private double additionalFee = 4.99;

    public InPostDelivery() {
        this.additionalFee = additionalFee;
    }

    @Override
    public void chooseDeliveryOption() {
        System.out.println("In Post delivery has been chosen");
    }

    @Override
    public double getAdditionalFee() {
        return this.additionalFee;

    }
}
