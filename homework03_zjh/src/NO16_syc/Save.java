package NO16_syc;

//存钱
public class Save implements Runnable{
    private Account account;

    public Save(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            int money = (int)(500 *Math.random()+500);
            account.save(money);
            try {
                Thread.sleep((int)Math.random()*100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
