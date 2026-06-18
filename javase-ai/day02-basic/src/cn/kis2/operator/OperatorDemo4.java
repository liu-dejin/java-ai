package cn.kis2.operator;

public class OperatorDemo4 {
    static void main() {
        print(10, 20);
        System.out.println("==================");
        print2(10, 10);
    }

    static void print(int a, int b) {
        System.out.println(a > b); // false
        System.out.println(a < b); // true
        System.out.println(a >= b); // false
        System.out.println(a <= b); // true
        System.out.println(a == b); // false
        System.out.println(a != b); // true

    }

    static void print2(int a, int b) {
        System.out.println(a > b); // false
        System.out.println(a < b); // false
        System.out.println(a >= b); // true
        System.out.println(a <= b); // true
        System.out.println(a == b); // true
        System.out.println(a != b); // false
    }

}
