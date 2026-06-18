package cn.kis2.polymorphism1;

public class Test {
    static void main() {
        // 1.对象多态 行为多态
        Animal a1 = new Wolf();
        a1.run(); // 编译看左边 运行看右边
        System.out.println(a1.name); // 编译/运行看左边
        Animal a2 = new Tortoise();
        a2.run();
        System.out.println(a2.name);
    }
}
