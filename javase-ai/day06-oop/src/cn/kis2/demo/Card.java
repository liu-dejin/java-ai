package cn.kis2.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// lombok 自动添加get set 无参构造 toString 方法
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    private String cardId;
    private String name;
    private String phone;
    private double money;

    // 存金额
    public void depositMoney(double money) {
        this.money += money;
    }
    // 消费金额
    public void consumeMoney(double money) {
        this.money -= money;
    }
}
