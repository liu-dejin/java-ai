package cn.kis2.method.hello;

public class HelloWorld {
    static void main() {
        System.out.println("hello,world");
        // 打印十行hello，world
        System.out.println("hello,world");
        System.out.println("hello,world");
        System.out.println("hello,world");
        System.out.println("hello,world");
        System.out.println("hello,world");
        System.out.println("hello,world");
        System.out.println("hello,world");
        System.out.println("hello,world");
        System.out.println("hello,world");
        System.out.println("hello,world");
        System.out.println("hello,world");
        System.out.println("================================");
        makeCode();
        printHello();
    }

    // 生成四位数验证码功能
    private static void makeCode() {
        int code = (int) (Math.random() * 10000);
        System.out.println(code);
    }


    // 打印三行你好
    static void printHello() {
        System.out.println("你好");
        System.out.println("你好");
        System.out.println("你好");
    }

}
