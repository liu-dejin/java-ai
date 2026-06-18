package cn.kis2.demo7executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsDemo3 {
    static void main() {
        // 线程池工具类 Executors 创建线程池
        ExecutorService pool = Executors.newFixedThreadPool(3);
        Future<String> f1;
        Future<String> f2;
        Future<String> f3;
        Future<String> f4;
        f1 = pool.submit(new MyCallable(100));
        f2 = pool.submit(new MyCallable(200));
        f3 = pool.submit(new MyCallable(300));
        f4 = pool.submit(new MyCallable(400));
        try {
            System.out.println(f1.get());
            System.out.println(f2.get());
            System.out.println(f3.get());
            System.out.println(f4.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
