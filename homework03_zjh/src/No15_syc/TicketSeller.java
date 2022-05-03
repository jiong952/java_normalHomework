package No15_syc;

public class TicketSeller extends Thread{
    private Ticket ticket;

    public TicketSeller(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void run() {
        //如果有票就一直卖
        while (Ticket.tic_number > 0){
            ticket.sell();
        }
}

    private void sleep(int i) {
    }
}
