package cn.kis2.innerclass2;

public class InnerClassDemo2 {
    static void main() {
        // 静态内部类
        Outer.Inner in = new Outer.Inner();
        in.show();

        // 1.静态内部类可以直接访问外部类的静态成员
        // 2.静态内部类不可以直接访问外部类的实例成员
    }
}
