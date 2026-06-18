package cn.kis2.demo1create;

// main方法本身是由一条主线程执行
public class Demo1 {
    static void main() {
        // 4.创建线程类对象 代表线程
        Thread t1 = new MyThread();
        // 5.启动线程 调用start方法  让线程调用run方法
        t1.start();

        // 不要把主线吃放在子线程之前
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程输出："+ i );
        }
    }
}

// 1.继承thread
class MyThread extends Thread {
    // 2. 重写thread的run方法
    @Override
    public void run() {
        // 3. 线程体
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程输出："+ i );
        }
    }
}

// 优点 编码简单
// 缺点 不能继承别的类 不利于功能拓展
