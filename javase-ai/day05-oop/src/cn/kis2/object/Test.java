package cn.kis2.object;

public class Test {
    static void main() {
        Star s1 = new Star();
        s1.name = "赵丽颖";
        s1.age = 18;
        s1.gender = "女";
        s1.height = 1.65;
        s1.weight = 50.5;
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.gender);
        System.out.println(s1.height);
        System.out.println(s1.weight);
        System.out.println("--------------------------------");


        Star s2 = new Star();
        s2.name = "张三";
        s2.age = 20;
        s2.gender = "男";
        s2.height = 1.80;
        s2.weight = 80.5;
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.gender);
        System.out.println(s2.height);
        System.out.println(s2.weight);
    }
}
