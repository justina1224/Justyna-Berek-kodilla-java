package com.kodilla.patterns.strategy.social;

public class FacebookPublisher  implements SocialPublisher {
    private String name;

    public FacebookPublisher(String name) {
        this.name = name;
    }

    @Override
    public String share() {
        return "sharing posts on " + name;

    }
}
