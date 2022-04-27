package No15_syc;

public class TestTicket {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(100);
        for(int i = 1;i <= 5;i++) {
            new Thread(new TicketSeller(ticket)).start();
        }
    }
}
