package cn.kis2.code;

import java.util.Arrays;

public class CodeDemo1 {
    public static String schoolName;
    public static String[] cards = new String[54];

    // 静态代码库 static 属于类 与类一起优先加载 自动执行一次
    // 对类的静态资源初始化
    static {
        System.out.println("静态代码块执行了");
        schoolName = "KIS2";
        cards[0] = "大王";
        cards[1] = "小王";

    }
    static void main() {
        // 静态代码块
        System.out.println(schoolName);
        System.out.println(Arrays.toString(cards));
    }
}
