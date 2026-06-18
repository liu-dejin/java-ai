package cn.kis2.operator;

public class OperatorDemo6 {
    static void main() {
        // 逻辑运算符
        System.out.println(print(180, 70, '女'));
        System.out.println(print(180, 90, '女'));
        System.out.println(print2(180, 90));
        System.out.println(print3(true));
        System.out.println("======================");
        print4();
        System.out.println("======================");

        print5();
    }

    // 判断某个人是否符合条件 身高>170 体重60-80 性别女
    static boolean print(int height, int weight, char sex) {
        return height > 170 & weight >= 60 & weight <= 80 & sex == '女';
    }

    // 要么身高要大于170 要么体重要小于80
    static boolean print2(int height, int weight) {
        return height > 170 | weight < 80;
    }

    // ! 真是假 假是真
    static boolean print3(boolean flag) {
        return !flag;
    }

    // 异或运算符
    static void print4() {
        System.out.println(false ^ false);  // false
        System.out.println(true ^ true);    // false
        System.out.println(false ^ true);   // true
        System.out.println(true ^ false);   // true
    }

    // 逻辑中断
    static void print5() {
        int a = 100;
        int b = 20;
        // System.out.println(a > 1000 && ++b > 20);    左边false 右边不执行 返回最后一个true
        System.out.println(a > 1000 & ++b > 20);
        System.out.println(b);

        int i = 10;
        int j = 3;
        // System.out.println(i++ > 10|| j++ > 3);
        // System.out.println(i > 1|| j++ > 3);   // 左边true 右边不执行
        System.out.println(i > 1  | j++ > 3);
        System.out.println(i + ", " + j);
    }


}
