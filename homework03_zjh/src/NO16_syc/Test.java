package NO16_syc;

public class Test {
    public static void main(String[] args) {
        Account account = new Account();
        new Thread(new Save(account)).start();
        new Thread(new Take(account)).start();
    }
}
