package cn.kis2.staticfield;

public class Test2 {
    static void main() {
        new User();
        new User();
        new User();
        new User();
        new User();

        System.out.println(User.count);
    }
}
