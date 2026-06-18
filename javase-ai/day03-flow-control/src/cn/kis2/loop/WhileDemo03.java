package cn.kis2.loop;

public class WhileDemo03 {
    static void main() {
        System.out.println("需要多少年：" + calc());
        System.out.println("需要折叠多少次" + calcPeak());
    }

    // 复利计算
    static int calc() {
        double money = 100000;
        double rate = 0.017;
        int year = 0;
        while (money < 200000) {
            year++;
            money = money * (1 + rate);
        }
        return year;

    }

    static int calcPeak() {
        double peckHeight = 8848860;
        double paperThickness = 0.1;
        int count = 0;
        while (paperThickness < peckHeight) {
            count++;
            paperThickness = paperThickness * 2;
        }
        return count;
    }
}
