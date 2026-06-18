package cn.kis2.extendsdemo1;

public class Test {
    static void main() {
        // 1.创建对象,封装老师的数据和
        // 子类可以继承父类的非私有成员
        // 子类对象是由子类和父类多张设计图共同创建出来的对象 所以子类对象是完整的
        Teacher t1 = new Teacher();
        t1.setName("张三");
        t1.setSkill("java");
        t1.setSex('男');
        System.out.println(t1.getName());
        System.out.println(t1.getSkill());
        System.out.println(t1.getSex());

        Consultant c1 = new Consultant();
        c1.setName("张三");
        c1.setNumber(1000);
        c1.setSex('男');
        System.out.println(c1.getName());
        System.out.println(c1.getNumber());
        System.out.println(c1.getSex());
    }
}
