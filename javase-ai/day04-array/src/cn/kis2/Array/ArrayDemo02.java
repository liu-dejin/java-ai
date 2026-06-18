package cn.kis2.Array;

import java.util.Scanner;

public class ArrayDemo02 {
    static void main() {
        // 动态声明数组
        inputScore();
    }

    // 录入学生成绩
    static void inputScore() {
        // 数据类型[] 数组名 = new 数据类型[数组长度]; 先确认类型和长度
        double[] scores = new double[5];
        // scores = [0.0,0.0,0.0,0.0,0.0] 默认初始化值
        // 录入成绩存入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个学生的成绩:");
            scores[i] = sc.nextDouble();
        }
        double allSum = scores[0];
        double maxScore = scores[0];
        double minScore = scores[0];
        for (int i = 1; i < scores.length; i++) {
            double score = scores[i];
            allSum += score;
            if (score > maxScore) {
                maxScore = score;
            }
            if (score < minScore) {
                minScore = score;
            }
            System.out.println("平均分" + allSum / scores.length);
            System.out.println("最高分" + maxScore);
            System.out.println("最低分" + minScore);
        }
    }
}
