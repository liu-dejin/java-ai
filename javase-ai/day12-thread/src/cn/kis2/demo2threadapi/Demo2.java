package cn.kis2.demo2threadapi;

public class Demo2 {
    // 线程休眠 sleep
    static void main() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                // 项目经理让我加上这行代码 如果用户是vip就注释掉
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
