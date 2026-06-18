package cn.kis2.staticfield;

public class Test {
    static void main() {
        // 1.类名.静态变量 (推荐写法)
        Student.name = "波妞";
        System.out.println(Student.name);
        // 2.对象名.静态变量 (不推荐)
        Student s1 = new Student();
        // s1.name = "小王";

        Student s2 = new Student();
        // s2.name = "小刘";
        // System.out.println(s1.name);
        // 3.对象名.实例变量  每个对象的实例变量都是独立的
        s1.age = 18;
        s2.age = 19;
        System.out.println(s1.age);

        // System.out.println(Student.age); // 报错!
    }
}
