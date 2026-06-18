package cn.kis2.demo2recuresion;

public class RecursionDemo2 {
    static void main() {
        // 计算n的阶乘
        System.out.println("5的阶乘："+factorial(5));
        System.out.println("1-5的和："+factorial2(5));
    }

    public static int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }

    // 递归三要素
    // 递归公式 递归终结点 递归的方向必须走向终结点
    public static int factorial2(int n) {
        if (n == 1) return 1;
        return n + factorial2(n - 1);
    }
}
