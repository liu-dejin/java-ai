package cn.kis2.branch;

import java.util.Scanner;

public class SwitchDemo03 {
    static void main() {
        test();
    }

    // switch 分支结构
    // 根据男女性别 推荐书本
    static void test() {
        System.out.println("请输入性别：");
        Scanner sc = new Scanner(System.in);
        String sex = sc.next();

        // 根据性别判断
        switch (sex) {
            case "男":
                System.out.println("爱上美少女");
                break;
            case "女":
                System.out.println("爱上美少年");
                break;
            default:
                System.out.println("爱情是狗屎");
        }
        switch (sex) {
            case "男":
            case "女":
            default:
                System.out.println("爱情是狗屎");
        }

    }
}
