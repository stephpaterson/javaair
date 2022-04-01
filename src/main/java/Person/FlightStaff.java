package Person;

public class FlightStaff extends Person{

    private Rank rank;

    public FlightStaff(String name, Rank rank) {
        super(name);
        this.rank = rank;
    }
}
