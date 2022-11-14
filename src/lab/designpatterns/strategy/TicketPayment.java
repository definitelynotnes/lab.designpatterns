package lab.designpatterns.strategy;

import lab.designpatterns.strategy.beans.Buyer;
import lab.designpatterns.strategy.beans.Tax;
import lab.designpatterns.strategy.factory.TicketFactory;
import lab.designpatterns.strategy.interfaces.Ticket;
import lab.designpatterns.strategy.type.TicketType;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class TicketPayment {
    double price;
    Ticket ticket;
    Buyer buyer;
    Tax tax;
    

    TicketFactory ticketFactory = TicketFactory.newInstance();
    public TicketPayment(Buyer buyer, Tax tax) {
        this.buyer = buyer;
        this.tax = tax;
    }
    
    public void printTicket() {
        setTicketType();
        showTicketSale();
    }
    
    private void showTicketSale() {
        this.ticket.showTicket(tax);
    }
    
    private void setTicketType() {
        if(buyer.getAge() <= 16) {
            this.ticket = ticketFactory.createTicket(TicketType.CHILD);
        }
        else if(buyer.getAge() > 65) {
            this.ticket = ticketFactory.createTicket(TicketType.SENIOR);
        }
        else {
            this.ticket = ticketFactory.createTicket(TicketType.ADULT);
        }
    }
    
    public Ticket getTicket() {
        return this.ticket;
    }
}
