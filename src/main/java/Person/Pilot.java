package Person;

public class Pilot extends FlightStaff{

    private String pilotLicenceNumber;

    public Pilot(String name, Rank rank, String pilotLicenceNumber) {
        super(name, rank);
        this.pilotLicenceNumber = pilotLicenceNumber;
    }
}
