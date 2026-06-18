package cn.kis2.demo6lock;

public class DrawThread extends Thread {
    private Account acc;  // 线程要处理的线账户

    public DrawThread(String name, Account acc) {
        super(name);
        this.acc = acc;
    }


    @Override
    public void run() {
        //  取钱
        acc.drawMoney(100000);
    }
}
