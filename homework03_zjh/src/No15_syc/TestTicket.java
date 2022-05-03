package No15_syc;

public class TestTicket {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        new Thread(ticket,"1").start();
        new Thread(ticket,"2").start();
        new Thread(ticket,"3").start();
        new Thread(ticket,"4").start();
    }
}
