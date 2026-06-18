package cn.kis2.demo7executorService;

import java.util.concurrent.*;

public class ExecutorServiceDemo1 {
    static void main() {
        // 创建线程池
        // 1.使用线程池的实现类 ThreadPoolExecutor 七个参数 创建线程池
        ThreadPoolExecutor pool = new ThreadPoolExecutor(3, 5, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<>(3), Executors.defaultThreadFactory(), new ThreadPoolExecutor.DiscardOldestPolicy());
        // 2.使用线程池处理任务 看会不会复用
        MyRunnable target = new MyRunnable();
        pool.execute(target); // 提交第一个任务 创建线程 自动执行
        pool.execute(target); // 提交第二个任务
        pool.execute(target); // 提交第三个任务
        pool.execute(target); // 复用线程
        pool.execute(target); // 复用线程
        pool.execute(target); // 复用线程
        pool.execute(target); // 到了临时线程创建时机
        pool.execute(target); // 到了临时线程创建时机
        pool.execute(target); // 到了任务拒绝策略

        // 关闭线程池（一般不关闭）
        // pool.shutdown(); // 等所有任务完成再关闭
        // pool.shutdownNow(); // 立即强制关闭
    }
}
