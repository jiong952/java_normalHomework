package extra;

import NO15.TicketSeller;

public class Test {
    public static void main(String[] args) {
        Bank bank = new Bank();
        new Thread(new Customer(bank)).start();
        new Thread(new Customer(bank)).start();
    }
}
