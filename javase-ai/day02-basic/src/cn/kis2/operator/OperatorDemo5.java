package cn.kis2.operator;

public class OperatorDemo5 {
    static void main() {
        // 三元运算符
        print(10, 20);
        print(12);
        System.out.println(print(10, 20, 30));
    }

    static void print(int a, int b) {
        int max = a > b ? a : b;
        System.out.println("较大值" + max);
    }

    // 判断是否挂科
    static void print(int score) {
        String result = score >= 60 ? "通过" : "挂科";
        System.out.println(result);
    }

    // 三个整数最大值返回
    static int print(int a, int b, int c) {
        int max = a > b ? a : b;
        max = max > c ? max : c;
        return max;
    }

    static int print2(int a, int b, int c) {
        // 三元嵌套
        return a > b ? a > c ? a : c : b > c ? b : c;
    }

}
