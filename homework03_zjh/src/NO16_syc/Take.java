package NO16_syc;

//取钱
public class Take implements Runnable{
    private Account account;

    public Take(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            int money = (int)(500 *Math.random()+500);
            account.get(money);

            try {
                Thread.sleep((int)Math.random()*100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
