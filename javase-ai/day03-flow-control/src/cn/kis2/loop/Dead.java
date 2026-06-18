package cn.kis2.loop;

public class Dead {
    static void main() {
        Deadloop();
    }

    // 使用for循环实现死循环
    static void Deadloop() {
        // for (; ; ) {
        //     System.out.println("你好");
        // }
        // while (true){
        //     System.out.println("你好");
        // }
        do {
            System.out.println("你好");
        } while (true);
    }
}
