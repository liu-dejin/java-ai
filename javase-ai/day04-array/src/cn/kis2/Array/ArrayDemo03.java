package cn.kis2.Array;

public class ArrayDemo03 {
    static void main() {
        int[] score = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max = getMax(score);
        System.out.println("最大值" + max);
    }

    static int getMax(int[] arr) {
        int max = arr[0];
        // 从输入第二个位置开始遍历

        for (int i = 0; i < arr.length; i++) {
            int data = arr[i];
            if (arr[i] > max) {
                max = data;
            }
        }
        return max;
    }
}
