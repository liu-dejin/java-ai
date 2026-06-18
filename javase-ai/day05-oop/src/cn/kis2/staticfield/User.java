package cn.kis2.staticfield;

public class User {
    static int count = 0;

    public User() {
        // 同一个类访问静态变量 省略类名
        count++;
    }
}
