import Person.CabinCrew;
import Person.Passenger;
import Person.Pilot;
import Person.Rank;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalTime;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    Flight flight;
    Pilot pilot;
    CabinCrew cabinCrew1;
    CabinCrew cabinCrew2;
    Passenger passenger1;
    Passenger passenger2;
    Plane plane;
    ArrayList<CabinCrew> cabinCrewList;
    ArrayList<Passenger> passengerList;
    FlightManager flightManager;

    @Before
    public void before(){
        pilot = new Pilot("Graham", Rank.CAPTAIN, "GG8787");
        cabinCrew1 = new CabinCrew("Helen", Rank.FLIGHT_ATTENDANT);
        cabinCrew2 = new CabinCrew("Hugh", Rank.FLIGHT_ATTENDANT);
        passenger1 = new Passenger("Tanay", 1);
        passenger2 = new Passenger("Miriam", 2);
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
        flightManager = new FlightManager(flight);
    }

    @Test
    public void canCalculateBaggageWeightToBeReserved(){
        assertEquals(12.5, flightManager.calculateBaggageWeightPerPerson(), 0.01);
    }

    @Test
    public void canCalculateBaggageWeightBooked(){
        assertEquals(25, flightManager.calculateBaggageWeightBooked(), 0.1);
    }

    @Test
    public void canCalculateBaggageWeightRemaining(){
        assertEquals(25, flightManager.calculateBaggageWeightRemaining(), 0.1);
    }

}
