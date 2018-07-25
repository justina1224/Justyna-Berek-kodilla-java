package com.kodilla.patterns.strategy.social;

public class SnapchatPublisher implements SocialPublisher {
    private String name;

    public SnapchatPublisher(String name) {
        this.name = name;
    }

    @Override
    public String share() {
        return "sharing posts on " + name;
    }
}
