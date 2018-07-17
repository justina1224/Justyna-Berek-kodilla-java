package com.kodilla.good.patterns.flights;

import java.util.*;
import java.util.stream.Collectors;

public class FlightFinder {
    private AvailableFlights availableFlights;

    public FlightFinder(final AvailableFlights availableFlights) {
        this.availableFlights = availableFlights;
    }

    public Set<ArrivalAirport> findFlightsFrom(String flyFrom) {

        if(availableFlights.getDepartures().toString().contains(flyFrom)) {

            Set<ArrivalAirport> arr = availableFlights.getFlights().entrySet().stream()
                    .map(Map.Entry::getKey)
                    .filter(a -> a.getDepartureAirport().getName().equals(flyFrom))
                    .map(Flight::getArrivalAirport)
                    .collect(Collectors.toSet());
            System.out.println("Destinations available from " + flyFrom + ":" + Arrays.toString(arr.toArray()));
            return arr;

        } else {

            System.out.println("There is no flight available, please choose a different location");
            return null;
        }
    }

    public Set<DepartureAirport> findFlightsTo(String flyTo) {

        if(availableFlights.getArrivals().toString().contains(flyTo)) {

            Set<DepartureAirport> dep = availableFlights.getFlights().entrySet().stream()
                    .map(Map.Entry::getKey)
                    .filter(a -> a.getArrivalAirport().getName().equals(flyTo))
                    .map(a -> a.getDepartureAirport())
                    .collect(Collectors.toSet());
            System.out.println("Airports from where you can fly to " + flyTo + ": " + dep.toString());
            return dep;

        } else {
            System.out.println("There is no flight available, please choose a different location");
            return null;
        }
    }

    public void findConnectingFlightsFromTo(String departureAirport, String arrivalAirport) {

        if (availableFlights.getArrivals().toString().contains(departureAirport) &&
                availableFlights.getArrivals().toString().contains(arrivalAirport)) {

            Set<ArrivalAirport> dep = availableFlights.getFlights().entrySet().stream()
                    .map(Map.Entry::getKey)
                    .filter(a -> a.getDepartureAirport().getName().equals(departureAirport))
                    .filter(a -> a.getArrivalAirport().getName().equals(arrivalAirport))
                    .map(f -> f.getArrivalAirport())
                    .collect(Collectors.toSet());

            if (dep.size() != 0) {
                System.out.println("Flight from " + departureAirport + " to " + arrivalAirport + " is available");
            } else {
                Set<String> dep1 = availableFlights.getFlights().entrySet().stream()
                        .map(Map.Entry::getKey)
                        .filter(a -> a.getArrivalAirport().getName().equals(arrivalAirport))
                        .map(f -> f.getDepartureAirport().getName().toString())
                        .collect(Collectors.toSet());

                Set<String> arr1 = availableFlights.getFlights().entrySet().stream()
                        .map(Map.Entry::getKey)
                        .filter(a -> a.getDepartureAirport().getName().equals(departureAirport))
                        .map(f -> f.getArrivalAirport().getName().toString())
                        .collect(Collectors.toSet());

                Set<String> commons = new HashSet<>(arr1);
                commons.retainAll(dep1);

                System.out.println("You can have a connecting flight from " + departureAirport + " to " +
                        arrivalAirport + " through " + commons.toString());
            }
        } else {
            System.out.println("There is no flight available, please choose a different location");
        }
    }
}

