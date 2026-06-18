package cn.kis2.demo;


import java.util.Random;
import java.util.Scanner;

public class Test02 {
    static void main() {
        guess();
    }

    // 猜数字
    static void guess() {

        // 减加法 65-91=> -65 =>(0-26)+65 r.nextInt(27)+65
        // 随机数
        // int num = (int) (Math.random() * 100) + 1;

        Random r = new Random();
        int luckNum = r.nextInt(100);

        while (true) {
            System.out.println("请输入猜测的数字");
            int guessNum = new Scanner(System.in).nextInt();
            if (guessNum > luckNum) {
                System.out.println("太大了");
            } else if (guessNum < luckNum) {
                System.out.println("太小了");
            } else {
                System.out.println("恭喜你，猜对了");
                break;
            }

        }
    }

}
