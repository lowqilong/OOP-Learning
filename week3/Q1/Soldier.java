public class Soldier {
    private String name;
    private double baseAllowance;

    // 'this' is to remove ambiguity
    // super must be the first statement in the constructor
    public Soldier(String name, double baseAllowance) {
        this.name = name;
        this.baseAllowance = baseAllowance;
    }

    public String getName() {
        return name;
    }

    public double getBaseAllowance() {
        return baseAllowance;
    }

    public double getGrossAllowance() {
        return baseAllowance;
    }

    public String toString() {
        // return "Soldier{name='" + name + "', baseAllowance=" + baseAllowance + "}";
        return String.format("%s{name='%s', baseAllowance=%.1f}", this.getClass().getName(), this.getName(),
                this.getBaseAllowance());

    }
}
