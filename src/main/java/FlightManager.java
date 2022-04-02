public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public double calculateBaggageWeightPerPerson() {
        double planeBaggageWeight = planeBaggageWeight();
        double planeCapacity = flight.getPlane().getPlaneType().getCapacity();
        return planeBaggageWeight / planeCapacity;
    }

    public double calculateBaggageWeightBooked() {
        double baggageWeightPerPerson = calculateBaggageWeightPerPerson();
        int numberOfPassengers = flight.getBookedPassengers().size();
        return baggageWeightPerPerson * numberOfPassengers;
    }

    public double calculateBaggageWeightRemaining() {
        double planeBaggageWeight = planeBaggageWeight();
        double weightBooked = calculateBaggageWeightBooked();
        return planeBaggageWeight - weightBooked;
    }

    public double planeBaggageWeight(){
        return flight.getPlane().getPlaneType().getWeight() / 2;
    }
}
