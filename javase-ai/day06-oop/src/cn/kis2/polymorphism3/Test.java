package cn.kis2.polymorphism3;

public class Test {
    static void main() {
        // 1.对象多态 行为多态
        Animal a1 = new Tortoise();
        a1.run(); // 编译看左边 运行看右边
        // 问题 不能调用子类独有功能
        // a1.shrinkHead(); 报错

        Tortoise t1 = (Tortoise) a1;
        t1.shrinkHead();



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

        // 使用 instanceof 判断 再进行强转
        if (w instanceof Wolf) {
            Wolf w1 = (Wolf) w; // 有继承就可以强转 编译阶段不会报错 运行阶段会报错 ClassCastException
            w1.attack();
        } else if(w instanceof Tortoise){
            Tortoise t2 = (Tortoise) w;
            t2.shrinkHead();
        }
    }


}
