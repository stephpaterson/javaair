package Person;

public class CabinCrew extends FlightStaff{

    public CabinCrew(String name, Rank rank) {
        super(name, rank);
    }

    public String talkToPassengers() {
        return "Please put on your seat belts";
    }
}
