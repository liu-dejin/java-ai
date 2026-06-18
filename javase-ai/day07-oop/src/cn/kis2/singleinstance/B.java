package cn.kis2.singleinstance;

public class B {
    // 懒汉式单例
    private static B b;

    private B() {
    }

    public static B getInstance() {
        if (b == null) {
             b = new B();
        }
        return b;
    }

}
