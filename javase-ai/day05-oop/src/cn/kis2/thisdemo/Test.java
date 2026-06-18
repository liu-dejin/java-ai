package cn.kis2.thisdemo;

public class Test {
    static void main() {
        Student s1 = new Student();
        s1.print();
        System.out.println(s1);
        System.out.println("----------------------------------");
        Student s2 = new Student();
        s2.name ="张三";
        s2.age = 18;
        s2.sex = '男';
        s2.print();
        System.out.println("===");
        System.out.println(s2);

        // this 解决变量名称冲突
    }
}
