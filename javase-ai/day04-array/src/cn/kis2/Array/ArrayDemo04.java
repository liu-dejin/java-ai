package cn.kis2.Array;

public class ArrayDemo04 {
    static void main() {
        // 二维数组
        // printArray();

        printArray2();
    }

    static void printArray() {
        String[][] names = {{"张三", "李四"}, {"王五", "赵六"}, {"孙七", "周八"},};
        System.out.println(names[1][0]);

        // 数组名.lenght 行数
        int[][] arr = new int[3][4];// 静态声明数组
    }

    static void printArray2() {
        String[][] names = {{"张三", "李四"}, {"王五", "赵六"}, {"孙七", "周八"},};

        for (int i = 0; i < names.length; i++) {
            for (int n = 0; n < names[i].length; n++) {
                System.out.println(names[i][n] + '\t');
            }
            System.out.println();
        }
    }
}
