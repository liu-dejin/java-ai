package cn.kis2.demo4test;

import java.util.Arrays;

public class ParamDemo1 {
    static void main() {
        // 接受传参很灵活 替代数组传参
        sum(); // 不传值
        sum(1); // 传单个值
        sum(1, 2, 3, 4, 5); // 传多个值
        sum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}); // 传递数组
    }


    // 注意： 可变参数 形参中只能有一个  可变参数必须放在最后
    public static void sum(int... nums) {
        // 内部怎么拿数据
        // 可变参实际上就是一个数组 nums就是数组
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));
        System.out.println("==============================================");
    }
}
