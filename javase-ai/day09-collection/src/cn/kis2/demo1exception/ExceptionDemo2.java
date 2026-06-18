package cn.kis2.demo1exception;

public class ExceptionDemo2 {
    static void main() {
        // 异常的作用
        // 1.定位程序bug的关键信息
        // 2.作为方法内部的特殊返回值以便通知上层调用者 方法执行问题
        try {
            System.out.println(div(10, 2));
            System.out.println("程序执行成功");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("程序执行失败");

        }
    }

    private static int div(int a, int b) throws Exception {
        if (b == 0) {
            System.out.println("除数不能为0");
            // return -1;
           // 可以返回一个运行时异常 告诉上层调用者成功还是失败
           //  throw new RuntimeException("除数不能为0");
            throw new Exception("除数不能为0");
        }
        return a / b;
    }

}
