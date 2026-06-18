package cn.kis2.demo;

import java.util.Scanner;

public class Test01 {
    static void main() {
        calc();
    }

    static void calc() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入第一个数字: ");
        double num1 = scanner.nextDouble();

        System.out.print("请输入运算符 (+, -, *, /): ");
        String operator = scanner.next();

        System.out.print("请输入第二个数字: ");
        double num2 = scanner.nextDouble();

        // 设计一个计算方法
        double result = calcMethod(num1, operator, num2);
        System.out.println(result);
    }

    static double calcMethod(double num1, String operator, double num2) {
        double result = 0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("错误: 除数不能为0!");
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("错误: 无效的运算符!");
        }

        return result;
    }
}
