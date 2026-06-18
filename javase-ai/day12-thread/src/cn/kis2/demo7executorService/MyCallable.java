package cn.kis2.demo7executorService;

import java.util.concurrent.Callable;

// 实现Callable
public class MyCallable implements Callable<String> {
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
         return Thread.currentThread().getName() + "1到" + n +  "计算结果" + sum;
    }
}

// 优点：线程任务类只是实现接口，可以继续继承类和实现接口，扩展性强；可以在线程执行完毕后去获取线程执行的结果。
// 缺点：编码复杂一点。
