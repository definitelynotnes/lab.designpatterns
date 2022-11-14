package lab.designpatterns.strategy.interfaces;

import lab.designpatterns.strategy.beans.Tax;

public interface Ticket {
    public static final double TICKET_PRICE = 0;

    default void showTicket(Tax tax) {
        System.out.println("Ticket Price: " + getTicketPrice(tax));
        System.out.println("Ticket Category: " + getTicketCategory());
        System.out.println("Tax: " + getTaxRate(tax));
    }
    
    default double getTicketPrice(Tax tax) {
        return getCategoryTicketPrice() + (getCategoryTicketPrice()* tax.getTax());
    }
    
    default double getTaxRate(Tax tax) {
        return tax.getTax();
    }
    
    double getCategoryTicketPrice();
    String getTicketCategory();
}
