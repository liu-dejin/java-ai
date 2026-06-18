package cn.kis2.loop;

public class BreakAndContinueDemo06 {
    static void main() {
        test01();
        test02();
    }

    static void test01() {
        for (int i = 0; i < 10; i++) {
            // 结束并退出循环 跑路了  或者结束switch分支
            if (i == 5) break;
            System.out.print(i);
        }
    }
    static void test02(){
        for (int i = 0; i < 10; i++) {
            // 结束并退出循环 请假了 只能在循环使用
            if (i == 5) continue;
            System.out.print(i);
        }
    }
}

