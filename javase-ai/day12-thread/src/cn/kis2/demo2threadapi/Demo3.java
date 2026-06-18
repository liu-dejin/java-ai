package cn.kis2.demo2threadapi;


public class Demo3 {
    static void main() {
        // join 线程插队 让调用join的线程先执行
        MyThread2 t1 = new MyThread2();
        t1.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程输出："+ i );
            if(i==1){
                try {
                    t1.join(); // 让t1先执行
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程输出："+ i );
        }
    }
}
