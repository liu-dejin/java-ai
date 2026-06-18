package cn.kis2.method;

public class MethodDemo2 {
    static void main() {
        // 方法重载 类型  个数  顺序不同  方法名相同
    }

    // 定义一个方法 打印一个整数
    static void print(int a) {
        System.out.println(a);
    }

    static void print(String str) {
        System.out.println(str);
    }

    static void print(int a, double b) {
        System.out.println(b);
    }

    static void print(double b, int a) {
        System.out.println(b);
    }

    // 冲突了
    // static void print(double b1, int a1) {
    //     System.out.println(b1);
    // }

    static void fire(int x, int y) {
        System.out.println("经度:" + x + "维度:" + y);
    }

    static void fire(int x, int y, String location) {
        System.out.println("经度:" + x + "维度:" + y + location);
    }
}
