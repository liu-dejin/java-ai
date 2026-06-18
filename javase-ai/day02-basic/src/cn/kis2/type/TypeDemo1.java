package cn.kis2.type;

public class TypeDemo1 {
    static void main() {
        // 自动类型转换
        // 强制类型转换
        byte b = 1;
        print(b);   // 1

        print2(b);  // 1.0
        System.out.println("=====================");

        int i = 20;
        // print3(i); // 大范围不能复制给小范围

        // 强制类型转换
        byte j = (byte) i;
        print3(j);

        System.out.println("+++++++++++++++++++");
        int i1 = 15000;
        byte i2 = (byte) i1;
        print3(i2); // 数据溢出

        System.out.println("保留整数部分");
        double p = 3.1415926;
        int p1 = (int) p;
        print(p1);
    }

    static void print(int a) {
        System.out.println(a);
    }

    static void print2(double a) {
        System.out.println(a);
    }

    static void print3(byte b) {
        System.out.println(b);
    }
}
