package com.kodilla.good.patterns.flights;

public class Application {
    public static void main(String[] args) {

        FlightsRetriever flightsRetriever = new FlightsRetriever();
        AvailableFlights availableFlights = flightsRetriever.retrieve();
        FlightFinder finder = new FlightFinder(availableFlights);

        System.out.println("The number of available flights: " + availableFlights.getFlights().size());

        finder.findFlightsFrom("Krakow");
        finder.findFlightsTo("Warsaw");
        finder.findConnectingFlightsFromTo("Berlin", "London");
    }
}