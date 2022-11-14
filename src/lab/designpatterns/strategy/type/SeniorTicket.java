package lab.designpatterns.strategy.type;

import lab.designpatterns.strategy.interfaces.Ticket;

public class SeniorTicket implements Ticket {
    public static final double TICKET_PRICE = 12;

    @Override
    public double getCategoryTicketPrice() {
        // TODO Auto-generated method stub
        return TICKET_PRICE;
    }

    @Override
    public String getTicketCategory() {
        // TODO Auto-generated method stub
        return "Senior";
    }
}


