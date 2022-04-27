package extra;

public class Customer implements Runnable{
    private Bank bank;

    public Customer(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            bank.save(100);
            try {
                Thread.sleep((int)Math.random()*100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
