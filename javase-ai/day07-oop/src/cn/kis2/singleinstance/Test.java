package cn.kis2.singleinstance;

public class Test {
    static void main() {
        // 单例模式
        // A a1 = A.a;
        // A a2 = A.a;
        A a1 = A.getInstance();
        A a2 = A.getInstance();
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a1 == a2);

        // A.a = null; // 把A类的唯一变量干掉了

        B b1 = B.getInstance();
        B b2 = B.getInstance();
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1 == b2);


    }
}
