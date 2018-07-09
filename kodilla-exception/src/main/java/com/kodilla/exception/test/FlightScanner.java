package com.kodilla.exception.test;

import java.sql.SQLOutput;
import java.util.HashMap;

import java.util.Map;

public class FlightScanner {
    public void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> availableArrivalAirport = new HashMap<>();
        availableArrivalAirport.put("Stuttgart", true);
        availableArrivalAirport.put("Lisbon", true);
        availableArrivalAirport.put("London", true);
        availableArrivalAirport.put("Berlin", true);
        availableArrivalAirport.put("Frankfurt", true);
        availableArrivalAirport.put("Gdansk", true);
        availableArrivalAirport.put("Doncaster", true);

        if (availableArrivalAirport.containsKey(flight.getArrivalAirport())) {
            System.out.println("Flights to " + flight.getArrivalAirport() + " are available");
        } else {
            throw new RouteNotFoundException("There is no such an airport!");
        }
    }

}