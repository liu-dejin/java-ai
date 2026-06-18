package cn.kis2.demo7executorService;

import java.util.concurrent.*;

public class ExecutorServiceDemo2 {
    static void main() {
        // 创建线程池
        // 1.使用线程池的实现类 ThreadPoolExecutor 七个参数 创建线程池

        try (ThreadPoolExecutor pool = new ThreadPoolExecutor(3, 5, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<>(3), Executors.defaultThreadFactory(), new ThreadPoolExecutor.DiscardOldestPolicy())) {
            // 2.使用线程池处理任务 Callable

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
}
