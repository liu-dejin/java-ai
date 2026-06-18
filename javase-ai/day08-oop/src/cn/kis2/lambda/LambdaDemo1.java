package cn.kis2.lambda;

// 函数式接口
@FunctionalInterface
interface Swim {
    void swimming();
}

public class LambdaDemo1 {
    static void main() {
        Animal animal = new Animal() {
            @Override
            public void cry() {
                System.out.println("喵喵喵");
            }
        };
        animal.cry();

        // 错误示范 lambda不能简化全部匿名内部类 只能简化函数式接口的匿名内部类
        // Animal a1 = () ->{
        //         System.out.println("喵喵喵");
        //     }
        // };
        // a1.cry();
        System.out.println("=======================");

        Swim s1 = () -> System.out.println("学生游泳贼快");
        s1.swimming();

    }
}

abstract class Animal {
    public abstract void cry();
}
