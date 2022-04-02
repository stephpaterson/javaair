import Person.Pilot;
import Person.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Martin", Rank.CAPTAIN, "MB123" );
    }

    @Test
    public void canFlyPlane(){
        assertEquals("We are clear for take off", pilot.flyPlane());
    }

}
