package cn.kis2.loop;

public class WhileDo04 {
    static void main() {
        print();
    }

    static void print() {
        int i = 0;
        do {    // 先执行再判断 一定会执行一次
            System.out.println("hello,");
            i++;
        } while (i < 30);
        System.out.println(i);
    }
}
