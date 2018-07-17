package com.kodilla.good.patterns.flights;

public class DepartureAirport {
    private String name;

    public DepartureAirport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
