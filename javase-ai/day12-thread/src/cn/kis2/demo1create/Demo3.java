package cn.kis2.demo1create;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Demo3 {
    static void main() {
        // 创建方式3 实现Callable 获取线程执行完毕的结果
        // 3.创建Callable实现类对象
        Callable<String> c = new MyCallable(100);

        // 4.把Callable对象封装成任务对象 futureTask对象
        /**
         * 1.本身是一个Runnable线程任务对象 可以交给Thread
         * 2.可以获取线程执行完毕的结果
         */
        FutureTask<String> s = new FutureTask<>(c);

        // 5.FutureTask 传递给Thread对象
        Thread t = new Thread(s);
        t.start();


        Callable<String> c2 = new MyCallable(1100);


        FutureTask<String> s2 = new FutureTask<>(c2);

        Thread t2 = new Thread(s2);
        t2.start();

        try {
            // 如果第一个线程没有执行完毕，会让出cpu 等第一个线程执行完毕才会往下执行
            System.out.println(s.get());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            System.out.println(s2.get());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

// 实现Callable
class MyCallable implements Callable<String> {
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    // 实现call方法
    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return "1到" + n + "子线程的计算结果" + sum;
    }
}

// 优点：线程任务类只是实现接口，可以继续继承类和实现接口，扩展性强；可以在线程执行完毕后去获取线程执行的结果。
// 缺点：编码复杂一点。
