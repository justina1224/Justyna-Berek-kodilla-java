package com.kodilla.patterns.strategy.social;

public class TwitterPublisher implements SocialPublisher {
    private String name;

    public TwitterPublisher(String name) {
        this.name = name;
    }

    @Override
    public String share() {
        return "sharing posts on " + name;
    }
}
