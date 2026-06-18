package cn.kis2.demo;

import java.util.Scanner;

public class Test {
    static void main() {
        // 加油站支付
        // 1.创建卡片类 封装车主信息
        // 2.卡片父类 Card 金卡银卡共同属性
        // 3.金卡类 继承Card类 8折加洗车 银卡类 继承Card类 9折
        // 4.办一张金卡  交给独立的业务(支付机) 存款消费
        // 5.办一张银卡  交给独立的业务(支付机) 存款消费
        GoldCard g = new GoldCard("1", "jin", "149", 5000);
        pay(g);
        SilverCard s = new SilverCard("2", "jin jin", "149", 1000);
        pay(s);
    }

    // 支付机
    public static void pay(Card c) {
        System.out.println("请刷卡,请输入消费金额");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        c.consumeMoney(money);
    }

}
