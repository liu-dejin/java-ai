package cn.kis2.finaldemo;

public class FinalDemo1 {
    // final 修饰静态成员变量
    // 修改静态成员变量被称为常量 记住一个固定值 不能被修改 通常被作为配置信息
    // 常量名称建议全大写 多单词下划线连接
    public static final String SCHOOL_NAME = "张三";
    private final String NAME = "张三"; // 一般没有意义

    static void main() {
        // final 关键字的注意点
        final int a = 10; // final修饰的变量只能被赋值一次
        /*
          变量有哪些
          成员变量 （类变量）静态成员变量 实例成员变量
          局部变量
         */
        // a = 20;
        FinalDemo1 finalDemo1 = new FinalDemo1();
        System.out.println(finalDemo1.NAME);
        System.out.println(FinalDemo1.SCHOOL_NAME);
        // finalDemo1.NAME = "张三";

       final int[] arr = {1,2,3};
       arr[0] = 10; // 数组元素可以修改
    }

    public static void buy(final double z) {
        // 防止更改局部变量
        System.out.println(z);
    }
}

// 1. final修饰类 类不能被继承
final class A {
}
// class B extends A {}

// 2. final修饰方法 不能被重写
class C {
    public final void run() {
        System.out.println("run");
    }
}

class D extends C {
    // @Override
    // public void run() {} // 错误
}
