package cn.kis2.method.literal;

/**
 * 常见字面量
 */

public class LiteralDemo {
    static void main() {
        printLiteral();
    }

    // 打印字面量
    public static void printLiteral (){
        // 输出常见字面量
        // 整型
        System.out.println(1);
        // 浮点型
        System.out.println(1.4);
        // 浮点型
        System.out.println(true);
        // 字符
        System.out.println('a');
        // 字符串
        System.out.println("中国");
        //  特殊字面量
        System.out.println("中\n国");
        System.out.println("中\t国");

        // \n 换行   \t tab缩进

    }
}
