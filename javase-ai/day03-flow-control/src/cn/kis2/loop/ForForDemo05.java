package cn.kis2.loop;

public class ForForDemo05 {
    static void main() {
        For();
        NineNine();
    }

    static void For() {
        // 打印四行五列
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");  //不换行打印
            }
            // 打印空行
            System.out.println();
        }

    }
    // 九九乘法表
    static void NineNine() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }
}
