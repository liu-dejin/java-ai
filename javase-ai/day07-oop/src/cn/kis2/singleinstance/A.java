package cn.kis2.singleinstance;

public class A {

    // 饿汉式单例
    // 2.创建一个静态变量 记录本类的唯一对象
    // public static final A a = new A();
    private static final A a = new A();

    // 1.私有化构造器 确保单例类对外不能创建太多对象 单例才有可能性
    private A() {
    }

    // 3.提供一个静态方法 返回这个类的唯一对象
    public static A getInstance() {
        return a;
    }
}
