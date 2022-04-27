package NO15;

public class Ticket {
    //票数
    public static int tic_number;

    public Ticket(int tic_number) {
        Ticket.tic_number = tic_number;
    }
    public void sell(){
        String name = Thread.currentThread().getName();
        while (tic_number > 0){
            System.out.println("窗口"+name+"卖"+Ticket.tic_number);
            tic_number--;
        }
    }
}
