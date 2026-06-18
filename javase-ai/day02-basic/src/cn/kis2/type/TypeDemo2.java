package cn.kis2.type;

public class TypeDemo2 {
    static void main() {
        // 表达式自动类型提升


        System.out.println(calc2((byte) 110, (byte) 120));
    }

    static double calc(int a, int b, char ch, double d) {
        // 按最高类型决定
        return a + b + ch + d;
    }

    static int calc2(byte a, byte c) {
        // byte short char 都是直接转为int
        return a + c;
    }
}
