package cn.kis2.demo1exception;

import java.util.Scanner;

public class ExceptionDemo6 {
    static void main() {
        // 异常的处理方案2 最外层捕获异常重新修复
       // 接收用户的定价
        while (true) {
            try {
                System.out.println("定价"+userInputPrice());
                break;
            } catch (Exception e) {
                System.out.println("重新输入");
            }
        }
    }
    public static double userInputPrice(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入商品定价");
        return sc.nextDouble();
    }
}
