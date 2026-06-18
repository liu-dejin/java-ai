package cn.kis2.demo2recuresion;

public class RecursionDemo3 {
    static void main() {
        // 递归解决猴子吃桃问题
        System.out.println(count(1));
        System.out.println(count(2));
        System.out.println(count(3));
        System.out.println(count(4));
    }
    static int count(int n) {
        // fn = fn - fn/2-1
        // 2fn = 2fn- fb -2
        // fn = 2fn+1 +2
        return n==10 ? 1 : 2 * count(n + 1) + 2;
    }
}
