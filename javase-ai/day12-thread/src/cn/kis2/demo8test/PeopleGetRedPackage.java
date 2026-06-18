package cn.kis2.demo8test;

import java.util.List;

public class PeopleGetRedPackage extends Thread {
    private  List<Integer> redPacket;

    public PeopleGetRedPackage(List<Integer> RedPacket, String name) {
        super(name);
        this.redPacket = RedPacket;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        while (true) {

            // 100个人来抢redPacket
            synchronized (redPacket){
                if (redPacket.size() == 0) {
                    break;
                }
                // 随机索引取钱
                int index = (int) Math.random() * redPacket.size();
                Integer money = redPacket.remove(index);
                System.out.println(name + "抢到" + money + "元");
                if (redPacket.size() == 0) {
                    System.out.println("活动结束");
                    break;
                }
            }
        }
    }
}
