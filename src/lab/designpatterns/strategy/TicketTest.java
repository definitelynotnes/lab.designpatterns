package lab.designpatterns.strategy;

import lab.designpatterns.strategy.beans.Buyer;
import lab.designpatterns.strategy.beans.Tax;

public class TicketTest {
    static Tax tax;
    public static void main(String[] args) {
        tax = new Tax();
        
        Buyer buyer = new Buyer(12);
        TicketPayment ticketPayment = new TicketPayment(buyer, tax);
        ticketPayment.printTicket();
        
        Buyer newBuyer = new Buyer(46);
        ticketPayment = new TicketPayment(newBuyer, tax);
        ticketPayment.printTicket();
        
        Buyer seniorBuyer = new Buyer(67);
        ticketPayment = new TicketPayment(seniorBuyer, tax);
        ticketPayment.printTicket();
        
        tax.setTax(0.36);
        Buyer adultBuyerWithCustomTax = new Buyer(46);
        ticketPayment = new TicketPayment(adultBuyerWithCustomTax, tax);
        ticketPayment.printTicket();
    }
}
