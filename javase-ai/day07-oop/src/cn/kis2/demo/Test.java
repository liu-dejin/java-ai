package cn.kis2.demo;

import java.util.Scanner;

public class Test {
    static void main() {
        // 某智能家居系统，可以让用户选择要控制的家用设备（吊灯，电视机，洗衣机，落地窗)，并可以对它们进行打开或者关闭操作。
        // 角色 设备(灯,窗帘,洗衣机)
        // 具备的功能 开和关
        // 谁控制: 智能控制系统(单例)  控制调用开和关
        // 1.定义设备类
        // 2.设备对象 放在数据 代表整个家庭的设备
        JD[] jds = new JD[4];
        jds[0] = new Lamp("欧普", false);
        jds[1] = new TV("小米电视", true);
        jds[2] = new WashMachine("美的", true);
        jds[3] = new Air("格力", true);
        // 3.每个设备制定开和关  接口
        // 4.创建只能控制系统对象,控制设备的开和关
        SmartControl smartControl = SmartControl.getInstance();
        // 5.控制电视机
        // smartControl.control(jds[1]);

        // 6.提示用户操作 a.展示全部设备的当前情况 b.让用户选择哪一个操作
        // 打印全部设备的状态
        while (true) {
            smartControl.printAllStatus(jds);
            System.out.println("请输入你要控制的设备");
            Scanner sc = new Scanner(System.in);
            String command = sc.next();
            switch (command) {
                case "1":
                    smartControl.control(jds[0]);
                    break;
                case "2":
                    smartControl.control(jds[1]);
                    break;
                case "3":
                    smartControl.control(jds[2]);
                    break;
                case "4":
                    smartControl.control(jds[3]);
                    break;
                case "q":
                    System.out.println("退出系统");
                    return;
                default:
                    System.out.println("输入错误");
            }
        }
    }
}
