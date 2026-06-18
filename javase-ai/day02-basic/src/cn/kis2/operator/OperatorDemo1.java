package cn.kis2.operator;

public class OperatorDemo1 {
    static void main() {
        print(10, 3);
    }

    // 基本算数运算符
    static void print(int a, int b) {
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println((double) a / b);
        System.out.println(1.0 * a / b);
        System.out.println(a % b);


    }

    // + 特殊用法 字符串拼接
    static void print2() {
        int a = 15;
        System.out.println("abc" + a); // abc15
        System.out.println(a + 5); // 20
        System.out.println('a' + a + 'b'); // 122 字符底层是数字
    }
}
