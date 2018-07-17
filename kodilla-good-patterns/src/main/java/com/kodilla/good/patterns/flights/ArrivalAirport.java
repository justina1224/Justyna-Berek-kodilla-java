package com.kodilla.good.patterns.flights;

public class ArrivalAirport {
    private String name;

    public ArrivalAirport(String name) {
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
