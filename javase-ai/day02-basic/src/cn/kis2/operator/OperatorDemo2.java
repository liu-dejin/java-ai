package cn.kis2.operator;

public class OperatorDemo2 {
    static void main() {
        // 自增 自减 运算符    只能操作变量  前置后置单独使用是一样的
        // 不是单独使用 前置先加再用 后置先用再加
        print(10);
        System.out.println("=============================");
        print2(10);
    }

    // 接收一个整数
    static void print(int a) {
        a++;
        ++a;
        System.out.println(a);
        a--;
        --a;
        System.out.println(a);
    }
    // 理解前置后置的区别
    static void print2(int a) {
        int b = a++;
        System.out.println(a);  // 11
        System.out.println(b);  // 10
        int c = ++a;
        System.out.println(a); // 12
        System.out.println(c); // 12
    }

}
