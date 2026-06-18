package cn.kis2.staticmethod;

public class Test {
    static void main() {
        // 类名.静态方法
        Students.print();
        Students s1 = new Students();
        // s1.print();

        // 对象名.实例方法
        // Students.printPass(); // 类.实例方法
        s1.setScore((59.5));
        s1.printPass();
        // Test.printHello();
        printHello();

        // 这个方法只是为了做一个功能,不需要直接方法对象的数据 定义为静态方法
        // 这个方法是对象的行为，需要访问对象的数据，必须定义为实例方法
    }
    public static void printHello(){
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
    }

    // main方法其实是一个静态方法 运行的是类.main()
}
