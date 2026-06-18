package cn.kis2.demo3safe;

public class Demo1 {
    static void main() {
        // 安全问题
        // 设计一个账号类 用户创建小明小红的共同账户 存入10w
        Account acc = new Account("ICBC-0001", 100000);
        // 创建小明小红两个线程 模拟取款10w
         new DrawThread("小明",acc).start();
         new DrawThread("小红",acc).start();
    }
}
