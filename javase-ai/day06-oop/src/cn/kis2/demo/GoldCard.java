package cn.kis2.demo;

public class GoldCard extends Card {
    public GoldCard(String card, String name, String phone, double monry) {
        super(card, name, phone, monry);
    }
    // 八折优惠

    @Override
    public void consumeMoney(double money) {
        System.out.println("你金卡当前消费" + money);
        System.out.println("优惠后的价钱" + money * 0.8);
        if (getMoney() < money * 0.8) {
            System.out.println("余额不足");
            return;
        }
        // 更新金额
        setMoney(getMoney() - money * 0.8);
        // 消费大于200 打印洗车票
        if (money * 0.8 > 200) {
            printTicket();
            return;
        }
        System.out.println("未满200,不能洗车");
    }

    // 打印洗车票
    private void printTicket() {
        System.out.println("你可以洗车");
    }
}
