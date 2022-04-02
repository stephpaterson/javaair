import Person.CabinCrew;
import Person.Passenger;
import Person.Pilot;

import java.util.ArrayList;

public class Flight {

    private Pilot pilot;
    private ArrayList<CabinCrew> cabinCrewList;
    private ArrayList<Passenger> bookedPassengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(
            Pilot pilot,
            ArrayList<CabinCrew> cabinCrewList,
            ArrayList<Passenger> bookedPassengers,
            Plane plane,
            String flightNumber,
            String destination,
            String departureAirport,
            String departureTime
            ) {
        this.pilot = pilot;
        this.cabinCrewList = cabinCrewList;
        this.bookedPassengers = bookedPassengers;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }
}
