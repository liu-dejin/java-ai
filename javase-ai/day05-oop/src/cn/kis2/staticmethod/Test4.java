package cn.kis2.staticmethod;

public class Test4 {
    // 静态方法实例方法注意事项

    // 静态变量
    static int score = 100;
    // 实例变量
    private int age = 19;

    public static void printHello() {
        System.out.println("hello,world");
    }

    public static void main(String[] args) {
    }

    // 1.静态方法可以直接访问静态成员 不可以访问实例成员
    public static void print() {
        System.out.println(score);
        printHello();
        // System.out.println(new test4().age);
        // System.out.println(age); // 实例变量属于对象 不可以直接访问
        // run();

        // System.out.println(this); // 静态方法 不需要对象调
    }

    public void run() {
    }

    // 2、实例方法中既可以直接访问静态成员，也可以直接访问实例成员。

    // 3.实例方法中可以出现this关键字，静态方法中不可以出现this关键字的.
    public void go() {
        System.out.println(score);
        printHello();
        System.out.println(age);
        run();
        System.out.println(this);
    }
}
