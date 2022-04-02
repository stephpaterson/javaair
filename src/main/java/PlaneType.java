public enum PlaneType {
    AIRBUS_A350(100, 100),
    BOEING747(2, 150);

    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }
}


