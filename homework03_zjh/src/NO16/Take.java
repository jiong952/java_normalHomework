package NO16;
//取钱
public class Take implements Runnable{
    private Account account;

    public Take(Account account) {
        this.account = account;
    }
    //存钱方法
    public void deposit(Account account){
        //1000-5000元
        int money = (int)(4000 *Math.random()+1000);
        account.setBalance(account.getBalance()-money);
        System.out.println("已取出"+money+"账户余额"+account.getBalance());
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            this.deposit(account);
            try {
                Thread.sleep((int)Math.random()*100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
