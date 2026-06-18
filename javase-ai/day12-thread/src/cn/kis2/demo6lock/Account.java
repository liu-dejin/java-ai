package cn.kis2.demo6lock;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private String CardId;
    private double money;
    private final Lock lk = new ReentrantLock(); // final保护锁

    public void drawMoney(int money) {

        // 拿到当前线程名称
        String name = Thread.currentThread().getName();
        lk.lock();
        // 判断金额是否足够
        try {
            if (this.money >= money) {
                System.out.println(name + "取款成功" + money);
                // 修改余额
                this.money -= money;
                // 剩余
                System.out.println("剩余" + this.money);
            } else {
                System.out.println(name + "取款失败" + money);
            }
        } finally {
            lk.unlock();
        }
    }
}
