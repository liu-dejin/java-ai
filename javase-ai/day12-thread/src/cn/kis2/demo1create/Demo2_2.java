package cn.kis2.demo1create;

public class Demo2_2 {
    static void main() {
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("子线程");
            }
        }).start();

        // 主线程代码
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程输出：" + i);
        }
    }
}
