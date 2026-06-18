package cn.kis2.branch;

import java.util.Scanner;

public class IfDemo01 {
    static void main() {
        test01(20);
        test02();
        test3();
    }

    // 认识if结构
    static void test01(int age) {

        if (age > 18) {
            System.out.println("可以上网");
            return;
        }
        System.out.println("洗洗睡");
        // if条件只有一行可以省略
    }

    static void test02() {
        // 转账80 钱够转账成功,不够失败
        int money = 20;
        if (money > 80) {
            System.out.println("转账成功");
        }
        System.out.println("转账失败");
    }

    static void test3() {
        // 绩效打分级别
        // A 90+  B 80+ C 70+ D 60+
        System.out.println("请输入分数");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("不及格");
        }

    }
}
