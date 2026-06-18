package cn.kis2.object;

public class Test2 {
    static void main() {
        Student s1 = new Student();
        s1.name = "张三";
        s1.chinese = 100;
        s1.math = 100;
        s1.print();
        System.out.println("--------------------------------");
        Student s2 = new Student();
        s2.name = "李四";
        s2.chinese = 99;
        s2.math = 100;
        s2.print();
    }
}
