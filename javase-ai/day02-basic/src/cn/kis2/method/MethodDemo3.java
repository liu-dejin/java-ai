package cn.kis2.method;

public class MethodDemo3 {
    static void main() {
        // 无返回值的方法单独使用return   提前结束方法
        div(1,0);
    }

    // 设计一个除法的功能
    static void div(int a, int b) {
        if (b == 0) {
            System.out.println("除数不能为0");
            return;
        }
        System.out.println(a / b);
    }
}
