public class Octagon implements Shape {

    private double side;

    public Octagon(double side) {
        this.side = side;
    }

    double getSide() {
        return side;
    }

    public double getArea() {
        return Math.round(Math.pow(side, 2) * (2 + 2 * (Math.sqrt(2))) * 100.0) / 100.0;
    }

    public double getPerimeter() {
        return 8 * side;
    }

    public String toString() {
        return "Octagon(side=" + side + ",area=" + this.getArea() + ",perimeter=" + this.getPerimeter() + ")";
    }
}
