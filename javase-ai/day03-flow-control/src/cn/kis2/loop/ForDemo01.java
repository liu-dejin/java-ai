package cn.kis2.loop;

public class ForDemo01 {
    static void main() {
        // for循环
        test();
        sum();
        sumOdd();
        narcissus();
    }

    /**
     * for int i = 0 开始判断 执行循环体 i++ 再判断  直到不满足条件 退出循环
     */
    static void test() {
        for (int i = 0; i < 3; i++) {
            System.out.println("hello,world");
        }
        System.out.println("++++++++++++++++++++++++++++++++");
        for (int i = 0; i < 5; i++) {
            System.out.println("hello,world");
        }
    }

    static void sum() {
        int sum = 0;

        // 计算1-5的和
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }

        // 输出结果
        System.out.println("1-5的和为：" + sum);

    }

    static void sumOdd() {
        int sum = 0;

        // 计算1-10的奇数和
        // for (int i = 1; i <= 10; i++) {
        //     if (i % 2 != 0) {
        //         sum += i;
        //     }
        // }
        for (int i = 1; i <= 10; i+=2) {
            sum += i;
        }

        // 输出结果
        System.out.println("1-10的奇数和为：" + sum);

    }

    // 水仙花
    static void narcissus() {
        for (int i = 100; i <= 9999; i++) {
            int hundred = i / 100 ;
            int ten = i / 10 % 10;
            int individual = i % 10;
            double sum = Math.pow(hundred, 3) + Math.pow(ten, 3) + Math.pow(individual, 3);
            if (sum==i) System.out.println(i);
        }
    }
}
