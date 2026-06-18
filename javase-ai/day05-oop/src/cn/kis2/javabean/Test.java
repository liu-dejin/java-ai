package cn.kis2.javabean;

public class Test {
    static void main() {
        Student s1 = new Student();
        s1.setName("波妞");
        s1.setAge(18);
        s1.setSex('女');
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getSex());

        Student s2 = new Student();
        s2.setName("小王");
        s2.setAge(19);
        s2.setSex('男');
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
        System.out.println(s2.getSex());

        // 应用场景
        StudentOperation operation = new StudentOperation(s1);
        operation.printScore();
        operation.printAvgScore();

    }
}
