package cn.kis2;

import org.junit.jupiter.api.Test;

public class ThreadLocalTest {
    private static ThreadLocal<String> local = new ThreadLocal<>();


    @Test
    public void testThread() {
        local.set("main Message");

        System.out.println(Thread.currentThread().getName() + ":" + local.get());

        // 创建线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + ":" + local.get());
            }
        }).start();

        local.remove();
        System.out.println(Thread.currentThread().getName() + ":" + local.get());
    }
}
