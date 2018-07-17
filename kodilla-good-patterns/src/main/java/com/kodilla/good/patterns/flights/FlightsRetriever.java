package com.kodilla.good.patterns.flights;

public class FlightsRetriever {
    public AvailableFlights retrieve() {

        DepartureAirport dWarsaw = new DepartureAirport("Warsaw");
        DepartureAirport dKrakow = new DepartureAirport("Krakow");
        DepartureAirport dGdansk = new DepartureAirport("Gdansk");
        DepartureAirport dLondon = new DepartureAirport("London");
        DepartureAirport dBerlin = new DepartureAirport("Berlin");
        DepartureAirport dOslo = new DepartureAirport("Oslo");
        ArrivalAirport aWarsaw = new ArrivalAirport("Warsaw");
        ArrivalAirport aKrakow = new ArrivalAirport("Krakow");
        ArrivalAirport aGdansk = new ArrivalAirport("Gdansk");
        ArrivalAirport aLondon = new ArrivalAirport("London");
        ArrivalAirport aBerlin = new ArrivalAirport("Berlin");
        ArrivalAirport aOslo = new ArrivalAirport("Oslo");

        Flight FR1234 = new Flight("FR1234", dWarsaw, aBerlin);
        Flight FR1235 = new Flight("FR1235", dWarsaw, aLondon);
        Flight FR1236 = new Flight("FR1236", dWarsaw, aOslo);
        Flight FR1237 = new Flight("FR1237", dKrakow, aWarsaw);
        Flight FR1238 = new Flight("FR1238", dGdansk, aWarsaw);
        Flight FR1239 = new Flight("FR1239", dKrakow, aLondon);
        Flight FR1240 = new Flight("FR1240", dGdansk, aLondon);
        Flight FR1241 = new Flight("FR1241", dLondon, aWarsaw);
        Flight FR1242 = new Flight("FR1242", dLondon, aKrakow);
        Flight FR1243 = new Flight("FR1243", dLondon, aGdansk);
        Flight FR1244 = new Flight("FR1244", dOslo, aWarsaw);
        Flight FR1245 = new Flight("FR1242", dBerlin, aWarsaw);
        Flight FR1246 = new Flight("FR1246", dWarsaw, aKrakow);
        Flight FR1247 = new Flight("FR1241", dWarsaw, aGdansk);

        AvailableFlights availableFlights = new AvailableFlights();

        availableFlights.addFlight(FR1234, availableFlights.getFlights());
        availableFlights.addFlight(FR1235, availableFlights.getFlights());
        availableFlights.addFlight(FR1236, availableFlights.getFlights());
        availableFlights.addFlight(FR1237, availableFlights.getFlights());
        availableFlights.addFlight(FR1238, availableFlights.getFlights());
        availableFlights.addFlight(FR1239, availableFlights.getFlights());
        availableFlights.addFlight(FR1240, availableFlights.getFlights());
        availableFlights.addFlight(FR1241, availableFlights.getFlights());
        availableFlights.addFlight(FR1242, availableFlights.getFlights());
        availableFlights.addFlight(FR1243, availableFlights.getFlights());
        availableFlights.addFlight(FR1244, availableFlights.getFlights());
        availableFlights.addFlight(FR1245, availableFlights.getFlights());
        availableFlights.addFlight(FR1246, availableFlights.getFlights());
        availableFlights.addFlight(FR1247, availableFlights.getFlights());

        availableFlights.addLocation(aWarsaw);
        availableFlights.addLocation(aGdansk);
        availableFlights.addLocation(aKrakow);
        availableFlights.addLocation(aLondon);
        availableFlights.addLocation(aOslo);
        availableFlights.addLocation(aBerlin);
        availableFlights.addLocation(dWarsaw);
        availableFlights.addLocation(dGdansk);
        availableFlights.addLocation(dKrakow);
        availableFlights.addLocation(dLondon);
        availableFlights.addLocation(dOslo);
        availableFlights.addLocation(dBerlin);

        return availableFlights;
    }
}