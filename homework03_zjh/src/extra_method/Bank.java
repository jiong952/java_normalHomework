package extra_method;

public class Bank {
    private int balance = 0;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public synchronized void save(int num){
        setBalance(getBalance() + num);
        System.out.println(Thread.currentThread().getName() + "已汇入：" + num + "元，目前余额：" + getBalance() + "元");
    }
}
