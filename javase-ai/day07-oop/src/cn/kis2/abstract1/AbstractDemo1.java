package cn.kis2.abstract1;

public class AbstractDemo1 {
    static void main() {
        // 抽象类有得有失 得到了抽象方法的能力 失去了创建对象的能力
        // 抽象类不能创建对象
        // A a = new A(); // 抽象类不能创建对象

        // 抽象类的使命就是被继承 生孩子
        B b = new B();
        b.setA(1);
        b.setB(2);
        b.show();
        b.show1();
        System.out.println(b.getA());
        System.out.println(b.getB());
    }
}
