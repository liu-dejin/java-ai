package cn.kis2.demo2recuresion;

public class RecursionDemo1 {
    static void main() {
        printA();
    }
    public static void printA(){
        System.out.println("A执行了");
        printA(); // 递归可能出现死循环 栈溢出
    }

}
