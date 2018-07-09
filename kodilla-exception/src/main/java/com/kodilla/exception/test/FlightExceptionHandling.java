package com.kodilla.exception.test;

public class FlightExceptionHandling {
    public static void main (String[] args){
        FlightScanner flightScanner = new FlightScanner();

        Flight F2019 = new Flight("London", "Stuttgart");
        Flight R1019 = new Flight("Warsaw", "Lisbon");
        Flight L3453 = new Flight("Katowice", "London");
        Flight K2313 = new Flight("Madrid", "Berlin");
        Flight K1023 = new Flight("Paris", "Frankfurt");
        Flight M0943 = new Flight("Warsaw", "Berlin");
        Flight M6743 = new Flight("Berlin", "Roma");
        Flight N9873 = new Flight("Lublin", "Doncaster");

        try {
            flightScanner.findFlight(M6743);
        } catch (RouteNotFoundException e) {
            System.out.println("Exception: " + e + " has been caught and handled");
        }

        try {
            flightScanner.findFlight(new Flight("Lublin", "Roma"));
        } catch (RouteNotFoundException e) {
            System.out.println("Exception: " + e + " has been caught and handled");
        }
    }
}
