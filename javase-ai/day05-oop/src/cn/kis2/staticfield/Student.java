package cn.kis2.staticfield;

public class Student {
    static String name; // 静态变量 属于类 只加载一份 可以被类和全部对象共享访问
    int age;   // 实例变量 没有static 只属于对象 每个对象都有一份
}
