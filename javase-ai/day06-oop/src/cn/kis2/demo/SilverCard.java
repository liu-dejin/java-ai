package cn.kis2.demo;

public class SilverCard extends Card {
    public SilverCard(String card, String name, String phone, double money) {
        super(card, name, phone, money);
    }

    // 九折优惠
    @Override
    public void consumeMoney(double money) {
        System.out.println("你银卡当前消费" + money);
        System.out.println("优惠后的价钱" + money * 0.9);
        if (getMoney() < money * 0.9) {
            System.out.println("余额不足");
            return;
        }
        // 更新金额
        setMoney(getMoney() - money * 0.9);
    }
}
