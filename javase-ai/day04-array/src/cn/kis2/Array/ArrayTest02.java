package cn.kis2.Array;

public class ArrayTest02 {
    static void main() {
        start(9);
    }

    static void start(int n) {
        // 定义一个二维数组
        int[][] arr = new int[n][n];

        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = count++;
            }
        }
        printArray(arr);
        System.out.println("====================");

        // 打乱二维数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // 生成随机位置进行交换
                int randomRow = (int) (Math.random() * arr.length);
                int randomCol = (int) (Math.random() * arr[i].length);

                // 交换 arr[i][j] 和 arr[randomRow][randomCol]
                int temp = arr[i][j];
                arr[i][j] = arr[randomRow][randomCol];
                arr[randomRow][randomCol] = temp;
            }
        }
        printArray(arr);

    }

    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
