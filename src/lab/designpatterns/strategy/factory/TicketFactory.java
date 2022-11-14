package lab.designpatterns.strategy.factory;

import lab.designpatterns.strategy.interfaces.Ticket;
import lab.designpatterns.strategy.type.AdultTicket;
import lab.designpatterns.strategy.type.ChildTicket;
import lab.designpatterns.strategy.type.SeniorTicket;
import lab.designpatterns.strategy.type.TicketType;

public class TicketFactory {
    private static TicketFactory INSTANCE;

    public static TicketFactory newInstance() {
        if (INSTANCE == null) {
            INSTANCE = new TicketFactory();
        }
        return INSTANCE;
    }
    
    private TicketFactory() {
    }

    public Ticket createTicket(TicketType type) {
        Ticket ticket = null;
        switch (type) {
            case CHILD:
                ticket = new ChildTicket();
                break;
            case ADULT:
                ticket = new AdultTicket();
                break;
            case SENIOR:
                ticket = new SeniorTicket();
                break;
        }
        return ticket;
    }
}

