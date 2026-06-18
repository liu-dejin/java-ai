package cn.kis2.demo;

import java.util.Scanner;

public class AllTest {
    static void main() {
        Scanner sc = new Scanner(System.in);
        // 完成健康计算器
        // 1.输入个人信息 身高 体重  性别 年龄
        System.out.println("请输入身高");
        double h = sc.nextDouble();
        System.out.println("请输入体重");
        double w = sc.nextDouble();
        System.out.println("请输入性别");
        String sex = sc.next();
        System.out.println("请输入年龄");
        int age = sc.nextInt();
        // 2.计算BMI BMR
        double bmi = calcBMI(h, w);
        double bmr = calcBMR(h, w, age, sex);
        System.out.println("BMI: " + bmi + ", BMR: " + bmr);
    }

    // 计算BMI
    static double calcBMI(double h, double w) {
        return w / (h * h);

    }

    // 计算BMR
    static double calcBMR(double h, double w, int age, String sex) {
        if ("男".equals(sex)) {
            return 66 + 13.7 * w + 5 * h - 6.8 * age;
        }
        if ("女".equals(sex)) {
            return 655 + 9.6 * w + 1.8 * h - 4.7 * age;
        }
        return 0;
    }
}
