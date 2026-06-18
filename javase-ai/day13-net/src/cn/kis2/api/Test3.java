package cn.kis2.api;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test3 {
    static void main() {
        double a = 0.1;
        double b = 0.2;
        System.out.println(a + b);

        // BigDecimal
        // 必须使用 BigDecimal（String val） 才能解决
        // BigDecimal a1 = new BigDecimal(a + "");
        // BigDecimal b1 = new BigDecimal(b + "");
        // valueOf 方法简化书写
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);
        System.out.println(a1.add(b1).doubleValue());  // 最终转为小数

        // 除法
        BigDecimal a2 = BigDecimal.valueOf(0.1);
        BigDecimal b2 = BigDecimal.valueOf(0.3);

        BigDecimal k = a2.divide(b2,2, RoundingMode.HALF_UP); // 除不尽抛异常
        System.out.println(k);


    }
}
