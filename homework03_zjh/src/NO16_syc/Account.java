package NO16_syc;

public class Account {
    //余额
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public synchronized void save(int money){
        this.balance += money;
        System.out.println("已存入"+money+"账户余额"+this.balance);
    }
    public synchronized void get(int money){
        if(money > this.balance){
            System.out.println("余额不足" + money);
        }else {
            this.balance -= money;
            System.out.println("已取出"+money+"账户余额"+this.balance);
        }
    }
}
