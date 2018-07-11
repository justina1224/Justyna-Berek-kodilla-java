package com.kodilla.good.patterns.challenges;

public class Buyer {
    private String buyerName;
    private String realName;

    public Buyer(String buyerName, String realName) {
        this.buyerName = buyerName;
        this.realName = realName;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public String getRealName() {
        return realName;
    }
}
