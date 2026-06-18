package cn.kis2.extends2;

public class Fu {

    // 1.private成员方法 只能被本类访问
    private void privateMethod() {
        System.out.println("privateMethod");
    }
    // 2.缺省 只能在当前类 同一个包其他类中访问
    void defaultMethod() {
        System.out.println("defaultMethod");
    }
    // 3.protected成员方法 只能被本包或子类访问
    protected void protectedMethod() {
        System.out.println("protectedMethod");
    }
    // 4.public成员方法 可以被任何类访问
    public void publicMethod() {
        System.out.println("publicMethod");
    }

    static void main() {
        Fu fu = new Fu();
        fu.privateMethod();
        fu.defaultMethod();
        fu.protectedMethod();
        fu.publicMethod();
    }

    // 成员变量私有   方法公开
}
