public class Commando extends Soldier {
    private double vocationAllowance;

    public Commando(String name, double baseAllowance, double vocationAllowance) {
        super(name, baseAllowance);
        this.vocationAllowance = vocationAllowance;
    }

    public double getGrossAllowance() {
        return super.getBaseAllowance() + this.vocationAllowance;
    }

    public String toString() {
        return String.format("%s{%s{name='%s', baseAllowance=%.1f}, vocationAllowance=%.1f}", this.getClass().getName(),
                super.getClass().getSuperclass().getName(), super.getName(), super.getBaseAllowance(),
                this.vocationAllowance);
    }
}
