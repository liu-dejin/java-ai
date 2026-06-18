package cn.kis2.polymorphism2;

public class Test {
    static void main() {
        // 1.对象多态 行为多态
        Tortoise a1 = new Tortoise();
        a1.run(); // 编译看左边 运行看右边
        // 问题 不能调用子类独有功能
        // a1.shrinkHead(); 报错
        // 多态的好处 1.右边对象解耦合

        Wolf w = new Wolf();
        go(w);

        Tortoise t = new Tortoise();
        go(t);


    }

    // 父类类型的变量作为参数 可以接受一切子类对象
    // 动物竞跑
    public static void go(Animal w) {
        System.out.println("开始跑==================");
        w.run();
    }



}
