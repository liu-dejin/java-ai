package cn.kis2.demo1create;

public class Demo2 {
    static void main() {
        // 多线程的第二种创建方式  Runnable接口实现

        // 3.创建一个线程任务
        MyRunnable r = new MyRunnable();
        // 4. 把线程任务交给线程对象处理
        // Thread t = new Thread(r,"1号线程");
        Thread t = new Thread(r);
        // 5.启动线程
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程输出："+ i );
        }

    }
}

// 1.定义一个类实现runnable接口
class MyRunnable implements Runnable {

    // 2.重写run方法
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Runnable实现子线程" + i);
        }
    }
}

// 优点 只是实现接口 可以继续继承其他类、实现其他接口 拓展性强
// 缺点 多一个Runnable对象
