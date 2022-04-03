import java.time.LocalTime;
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
    private LocalTime departureTime;

    public Flight(
            Pilot pilot,
            ArrayList<CabinCrew> cabinCrewList,
            ArrayList<Passenger> bookedPassengers,
            Plane plane,
            String flightNumber,
            String destination,
            String departureAirport,
            LocalTime departureTime
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

    public int numberOfAvailableSeats() {
        return plane.getPlaneType().getCapacity() - bookedPassengers.size();
    }

    public void bookPassenger(Passenger passenger) {
        if (numberOfAvailableSeats() > 0) {
            bookedPassengers.add(passenger);
        }
    }

    public Plane getPlane() {
        return plane;
    }

    public ArrayList<Passenger> getBookedPassengers() {
        return bookedPassengers;
    }
}
