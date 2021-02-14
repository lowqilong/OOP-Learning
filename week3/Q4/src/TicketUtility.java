import ticketing.entity.*;
import java.util.ArrayList;

public class TicketUtility {

    public static double calculateAverageTicketPrice(ArrayList<Ticket> ticketList) {
        double total = 0;
        if (ticketList == null) {
            return 0.0;
        }

        if (ticketList.isEmpty()) {
            return 0.0;
        }

        for (int i = 0; i < ticketList.size(); i++) {
            double price = ticketList.get(i).calculatePrice();
            total += price;
        }
        return total / ticketList.size();
    }
}
