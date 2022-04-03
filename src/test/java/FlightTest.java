import Person.CabinCrew;
import Person.Passenger;
import Person.Pilot;
import Person.Rank;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalTime;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Pilot pilot;
    CabinCrew cabinCrew1;
    CabinCrew cabinCrew2;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Plane plane;
    ArrayList<CabinCrew> cabinCrewList;
    ArrayList<Passenger> passengerList;

    @Before
    public void before(){
        pilot = new Pilot("Graham", Rank.CAPTAIN, "GG8787");
        cabinCrew1 = new CabinCrew("Helen", Rank.FLIGHT_ATTENDANT);
        cabinCrew2 = new CabinCrew("Hugh", Rank.FLIGHT_ATTENDANT);
        passenger1 = new Passenger("Tanay", 1);
        passenger2 = new Passenger("Miriam", 2);
        passenger3 = new Passenger("Morris",1);
        plane = new Plane(PlaneType.BOEING747);
        cabinCrewList = new ArrayList<>();
        cabinCrewList.add(cabinCrew1);
        cabinCrewList.add(cabinCrew2);
        passengerList = new ArrayList<>();
        passengerList.add(passenger1);
        passengerList.add(passenger2);
        flight = new Flight(
                pilot,
                cabinCrewList,
                passengerList,
                plane,
                "FLYHIGH",
                "IBZ",
                "LGW",
                LocalTime.of(10,00)
        );
    }

    @Test
    public void canGetNumberOfAvailableSeats(){
        assertEquals(2, flight.numberOfAvailableSeats());
    }

    @Test
    public void canBookPassenger(){
        flight.bookPassenger(passenger3);
        flight.bookPassenger(passenger3);
        flight.bookPassenger(passenger3);
        assertEquals(4, passengerList.size());
    }


}
