package cn.kis2.operator;

public class OperatorDemo3 {
    static void main() {
        // 拓展的赋值运算
        demo1(10);
    }

    static void demo1(int b) {
        int a = 10;
        a += b; // a = (a的类型)a + b;
        System.out.println(a);

        byte c = 10;
        byte d = 20;

        c += d; // c = (c的类型)c + d;   c = (byte)(c + d);
        System.out.println(c);

        int e = 10;
        e %= 3;
        System.out.println(e);

        int f = 10;
        f /= 2; // f = (f的类型)f / 2;   f = (int)(f / 2);
        System.out.println(f);


    }
}
