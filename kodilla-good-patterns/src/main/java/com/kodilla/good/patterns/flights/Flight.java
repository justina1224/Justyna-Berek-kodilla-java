package com.kodilla.good.patterns.flights;

import java.util.Objects;

public class Flight {
    private String flightId;
    private DepartureAirport departureAirport;
    private ArrivalAirport arrivalAirport;

    public Flight(String flightId, DepartureAirport departureAirport, ArrivalAirport arrivalAirport) {
        this.flightId = flightId;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getFlightId() {
        return flightId;
    }

    public DepartureAirport getDepartureAirport() {
        return departureAirport;
    }

    public ArrivalAirport getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return Objects.equals(flightId, flight.flightId) &&
                Objects.equals(departureAirport, flight.departureAirport) &&
                Objects.equals(arrivalAirport, flight.arrivalAirport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightId, departureAirport, arrivalAirport);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightId='" + flightId + '\'' +
                ", departureAirport=" + departureAirport +
                ", arrivalAirport=" + arrivalAirport +
                '}';
    }
}
