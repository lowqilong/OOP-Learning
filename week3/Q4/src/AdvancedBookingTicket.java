import ticketing.entity.*;

public class AdvancedBookingTicket extends Ticket {
    private int numDaysInAdvance;

    public AdvancedBookingTicket(String title, int numDaysInAdvance) {
        super(title);
        this.numDaysInAdvance = numDaysInAdvance;
    }

    public double calculatePrice() {
        double original = super.calculatePrice();
        double deducted = original - numDaysInAdvance * 0.50;
        double final_price = Math.max(0.5 * original, deducted);

        return final_price;
    }
}
