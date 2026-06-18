package cn.kis2.demo8test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ThreadTest {
    static void main() {
        // 多线程案例
        // 目标：完成多线程的综合小案例
        // 红包雨游戏，某企业有100名员工，员工的工号依次是1,2,3,4，··到100。
        // 现在公司举办了年会活动，活动中有一个红包雨环节，要求共计发出200个红包雨。其中小红包在[1·30]元之间，
        // 总占比为80%，大红包[31-100]元，总占比为20%。

        // 100个员工就是100个线程 竞争200个红包
        List<Integer> RedPacket = getRedPacket();
        // 定义线程类 创建100个线程
        for (int i = 1; i <= 100; i++) {
            new PeopleGetRedPackage(RedPacket, "人" + i).start();
        }
    }

    // 准备200红包
    public static List<Integer> getRedPacket() {
        // 200个红包雨。其中小红包在[1·30]元之间
        List<Integer> RedPacket = new ArrayList<>();
        Random r = new Random();
        for (int i = 1; i <= 160; i++) {
            RedPacket.add(r.nextInt(30) + 1);
        }
        for (int i = 1; i <= 40; i++) {
            RedPacket.add(r.nextInt(70) + 31);
        }
        return RedPacket;
    }
}
