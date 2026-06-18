package cn.kis2.enumdemo;

public class Test {
    static void main() {
        // 认识枚举
        A x = A.X;
        System.out.println(x);

        A y = A.Y;
        System.out.println(y);

        System.out.println(x.name());
        System.out.println(y.name());
        System.out.println(x.ordinal()); // 索引
        System.out.println(y.ordinal()); // 索引
    }
}
