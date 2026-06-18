package cn.kis2.method;

public class MethodDemo1 {
    static void main() {
        int sum = getSum(1, 2);
        System.out.println(sum);
        System.out.println("=====================");
        int sum1 = getSum(200, 300);
        System.out.println(sum1);
        System.out.println("=====================");
        printHelloWorld();
        System.out.println("=================");
        String verifyCode = getVerifyCode(6);
        System.out.println(verifyCode);

    }

    // 定义一个方法求任意整数和并返回
    static int getSum(int a, int b) {
        return a + b;
    }

    // 打印三行你好   不需要参数也不需要返回值
    static void printHelloWorld() {
        System.out.println("hello,World");
        System.out.println("hello,World");
        System.out.println("hello,World");
    }

    // 返回指定位数的验证码返回
    static String getVerifyCode(int bit) {
        String s = "";
        int code = (int) (Math.random() * Math.pow(10, bit));
        return s + code;
    }
}
