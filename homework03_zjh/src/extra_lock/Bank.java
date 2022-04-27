package extra_lock;

import java.util.concurrent.locks.ReentrantLock;

public class Bank {
    private int balance = 0;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    //锁对象
    private final ReentrantLock lock = new ReentrantLock();

    public void save(int num){
        lock.lock();
        setBalance(getBalance() + num);
        System.out.println(Thread.currentThread().getName() + "已汇入：" + num + "元，目前余额：" + getBalance() + "元");
        lock.unlock();
    }
}
