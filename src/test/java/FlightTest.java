import Person.CabinCrew;
import Person.Passenger;
import Person.Pilot;
import Person.Rank;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class FlightTest {

    Flight flight;
    Pilot pilot;
    CabinCrew cabinCrew1;
    CabinCrew cabinCrew2;
    Passenger passenger1;
    Passenger passenger2;
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
                "10am"
        );
    }

    
}
