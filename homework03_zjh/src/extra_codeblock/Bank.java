package extra_codeblock;

public class Bank {
    private int balance = 0;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void save(int num){
        synchronized (this){
            setBalance(getBalance() + num);
            System.out.println(Thread.currentThread().getName() + "已汇入：" + num + "元，目前余额：" + getBalance() + "元");
        }
    }
}
