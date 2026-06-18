package cn.kis2.demo5syncmethod;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private String CardId;
    private double money;

    // 同步方法解决 线程安全问题
    public synchronized void drawMoney(int money) {

        // 拿到当前线程名称
        String name = Thread.currentThread().getName();

        // 判断金额是否足够
        if (this.money >= money) {
            System.out.println(name + "取款成功" + money);
            // 修改余额
            this.money -= money;
            // 剩余
            System.out.println("剩余" + this.money);

        } else {
            System.out.println(name + "取款失败" + money);
        }
    }
}
