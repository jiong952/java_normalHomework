package NO15;

import static java.lang.Thread.sleep;
public class TicketSeller implements Runnable{
    private Ticket ticket;

    public TicketSeller(Ticket ticket) {
        this.ticket = ticket;
    }


    @Override
    public void run() {
        //如果有票就一直卖
            ticket.sell();
        try {
            Thread.sleep((int)Math.random()*100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
    }
