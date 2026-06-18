package cn.kis2.method.variable;

public class VariableDemo1 {
    static void main() {
        getVar();
    }

    // 定义一个方法 定义变量
    static void getVar() {
        // 数据类型 变量名 = 值;
        int a = 10;
        System.out.println(a);
        // 小数 存储成绩
        double score = 90.5;
        System.out.println(score);

        // 为什么要用变量记录数据  提高处理数据的灵活性
        int number = 10;
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);

        System.out.println("-----------------");

        // 研究变量的特点
        int age = 19;
        System.out.println(age);
        age = 20;
        System.out.println(age);
        age += 1;
        System.out.println(age);
        age -= 2;
        System.out.println(age);

        System.out.println("-----------------");
        // 应用场景
        // 微信9.9 收5 付1
        double price = 9.9;
        System.out.println(price);
        price += 5;
        System.out.println(price);
        price -= 1;
        System.out.println(price);
        System.out.println("-----------------");
        char ch = 'a'; // 97的二进制码
        System.out.println(ch + 1);
        System.out.println("-----------------");
        // 直接写进制
        int i1 = 0b01000001;    // 二进制65
        System.out.println(i1);
        int i2 = 0141;    // 八进制97
        System.out.println(i2);
        int i3 = 0x61;    // 十六进制97
        System.out.println(i3);
        System.out.println("-----------------");
    }
}
