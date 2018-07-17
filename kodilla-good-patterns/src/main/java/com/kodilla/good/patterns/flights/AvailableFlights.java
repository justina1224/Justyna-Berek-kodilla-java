package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class AvailableFlights {
    private final Map<Flight,Boolean> flights;
    private final List<ArrivalAirport> arrivals;
    private final List<DepartureAirport> departures;

    public AvailableFlights() {
        this.flights = new HashMap<>();
        this.arrivals = new ArrayList<>();
        this.departures = new ArrayList<>();
    }

    public Map<Flight, Boolean> getFlights() {
        return this.flights;
    }

    public List<ArrivalAirport> getArrivals() {
        return arrivals;
    }

    public List<DepartureAirport> getDepartures() {
        return departures;
    }

    public void addFlight(Flight flight, Map flights) {
        flights.put(flight, true);
    }

    public void addLocation(DepartureAirport departureAirport) {
        departures.add(departureAirport);
    }

    public void removeLocation(DepartureAirport departureAirport) {
        departures.remove(departureAirport);
    }

    public void addLocation(ArrivalAirport arrivalAirport) {
        arrivals.add(arrivalAirport);
    }

    public void removeLocation(ArrivalAirport arrivalAirport) {
        arrivals.remove(arrivalAirport);
    }
}