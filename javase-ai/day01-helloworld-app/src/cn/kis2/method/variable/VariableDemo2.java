package cn.kis2.method.variable;

public class VariableDemo2 {
    /**
     * 八种数据类型
     */
    static void main() {

    }
    // 8种基本数据类型
    static void printVar(){
        // 1.整型
        byte b = 10;
        short a = 20;
        int i = 30;

        // 默认是int类型 42429129219881281超过了int的范围 加上L
        long l = 42429129219881281L;
        // 2.浮点型
        // 默认是double类型 float,必须加上F
        float f = 1.1F;
        double d = 2.3;
        // 3.字符型
        char ch = 'a';
        // 4.布尔类型
        boolean bool = true;
        System.out.println(bool);

        // 字符串
        String str = "中国";
        System.out.println(str);
    }
}
