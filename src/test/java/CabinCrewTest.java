import Person.CabinCrew;
import Person.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    CabinCrew cabinCrew;

    @Before
    public void before(){
        cabinCrew = new CabinCrew("Hugh", Rank.FLIGHT_ATTENDANT);
    }

    @Test
    public void canTalkToPassengers(){
        assertEquals("Please put on your seat belts", cabinCrew.talkToPassengers());
    }
}
