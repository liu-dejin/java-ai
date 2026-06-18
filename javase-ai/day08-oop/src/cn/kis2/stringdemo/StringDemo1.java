package cn.kis2.stringdemo;

import java.util.Scanner;

public class StringDemo1 {
    static void main() {
        // 创建字符串对象
        // 1.双引号  推荐
        String s1 = "hello world";
        System.out.println(s1);
        System.out.println(s1.length());

        // 2.new
        String s2 = new String();
        System.out.println(s2); // "" 空字符串

        String s3 = new String("hello,world");
        System.out.println(s3);

        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        String s4 = new String(chars);
        System.out.println(s4);

        byte[] bytes = {97, 92, 98, 99};
        String s5 = new String(bytes);
        System.out.println(s5);

        System.out.println("===========================");


        // "” 放在常量池 相同内容只放一份
        String t1 = "abc";
        String t2 = "abc";
        System.out.println(t1 == t2);

        String t3 = new String("abc");
        String t4 = new String("abc");
        System.out.println(t3 == t4);
        System.out.println("===================");

        // 字符串的方法
        String okLoginName = "admin";
        // System.out.println("请输入登录名");
        Scanner sc = new Scanner(System.in);
        // String loginName = sc.next();
        // // 不能使用== ==比较的是地址 必须使用equals
        // if (okLoginName.equals(loginName)) {
        //     System.out.println("登录成功");
        // } else {
        //     System.out.println("登录失败");
        // }

        System.out.println("===================");
        String phone = sc.next();
        System.out.println("处理后的手机号");
        String newPhone = phone.substring(0, 3) + "****" + phone.substring(7);
        System.out.println(newPhone);
    }
}
