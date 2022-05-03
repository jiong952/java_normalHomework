package No15_syc;

public class Ticket implements Runnable{
    //票数
    public static int tic_number = 10000;

    public synchronized void sell(){
        if (tic_number <= 0) {
            System.out.println("售票结束...");
            return;
        }

        //休眠50毫秒, 交叉运行
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("窗口 " + Thread.currentThread().getName() + " 售出一张票"
                + " 剩余票数=" + (--tic_number));
    }

    @Override
    public void run() {
        while (tic_number > 0){
            sell();
        }
    }
}

