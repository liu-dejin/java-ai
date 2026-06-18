package cn.kis2.branch;

public class IfDemo02 {
    static void main() {
        test1();
    }

    static void test1() {
        // 1.根据摄像头获取到三种灯的状态
        boolean red = true;
        boolean green = false;
        boolean yellow = false;

        // 红灯停,绿灯行,蓝灯准备
        if (red) {
            System.out.println("stop");
        } else if (green) {
            System.out.println("go");
        } else if (yellow) {
            System.out.println("prepare");
        } else {
            System.out.println("error");
        }
    }
}
