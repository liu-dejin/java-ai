package cn.kis2.Array;

public class ArrayTest01 {
    static void main() {
        start();
    }

    static void start() {
        String[] pokers = new String[54];
        // pokers = {null, null, null, null, null, null, null, null, null, null}
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                pokers[index++] = colors[j] + numbers[i];
            }
        }

        // 单独存大小王
        pokers[index++] = "小王";
        pokers[index] = "大王";

        System.out.println("新牌");
        // 打印扑克牌
        for (int i = 0; i < pokers.length; i++) {
            System.out.print(pokers[i] + "\t");
        }
        System.out.println();

        // 洗牌
        for (int i = 0; i < pokers.length; i++) {
            int index1 = (int) (Math.random() * pokers.length);
            int index2 = (int) (Math.random() * pokers.length);
            String temp = pokers[index1];
            pokers[index1] = pokers[index2];
            pokers[index2] = temp;
        }

        System.out.println("洗牌后");
        // 打印扑克牌
        for (int i = 0; i < pokers.length; i++) {
            System.out.print(pokers[i] + "\t");
        }
        System.out.println();

    }
}
