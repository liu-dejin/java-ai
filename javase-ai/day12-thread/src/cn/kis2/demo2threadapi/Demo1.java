package cn.kis2.demo2threadapi;

public class Demo1 {
    static void main() {
        Thread t1 = new MyThread("1号线程");
        t1.start();
        // t1.setName("1号线程");
        System.out.println(t1.getName());

        Thread t2 = new MyThread();
        t2.start();
        t2.setName("2号线程");
        System.out.println(t2.getName());

        Thread m = Thread.currentThread();
        m.setName("主线程");
        System.out.println(m.getName()); // main

    }
}



class MyThread extends Thread {
    public MyThread(String s) {
        super(s); // 执行父类的构造方法
    }
    public MyThread() {

    }

    @Override
    public void run() {
        // 3. 线程体
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "子线程输出："+ i );
        }
    }
}

