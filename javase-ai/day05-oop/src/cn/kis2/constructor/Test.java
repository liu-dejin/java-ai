package cn.kis2.constructor;

public class Test {
    static void main() {

        // 创建对象 自动调用构造器
        Student s1 = new Student();
        Student s2 = new Student("张三", 18, '男');

        // 场景

        Student t1 = new Student();
        t1.name = "张三";
        t1.age = 18;
        t1.sex = '男';

        // 1. 创建对象 自动给属性赋值
        Student t2 = new Student("张三", 18, '男');
    }
}
