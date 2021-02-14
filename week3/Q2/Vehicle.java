public class Vehicle {
    private int numWheels;
    private double distancePerLiter;

    public Vehicle(int numWheels, double distancePerLiter) {
        this.numWheels = numWheels;
        this.distancePerLiter = distancePerLiter;
    }

    public String toString() {
        return String.format("%s[numWheels=<%s>, distancePerLiter=<%s>]", this.getClass().getName(), this.numWheels,
                this.distancePerLiter);
    }
}
