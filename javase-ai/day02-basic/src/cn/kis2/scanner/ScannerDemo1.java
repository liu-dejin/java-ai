package cn.kis2.scanner;

import java.util.Scanner;

public class ScannerDemo1 {
    static void main() {
        print();
    }

    static void print() {
        // 创建对象 scanner对象
        // 用户输入再保存到变量
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的名字：");
        String name = sc.next();
        System.out.println("请输入你的年龄：");
        int age = sc.nextInt();
        System.out.println("请输入你的体重：");
        double weight = sc.nextDouble();
        System.out.println("请输入你的性别：");
        char sex = sc.next().charAt(0);
        System.out.println("请输入你的生日：");
        String birthday = sc.next();
        System.out.println("请输入你的手机号：");
        long phone = sc.nextLong();
        System.out.println(name + age + weight + sex + birthday + phone);
    }
}
