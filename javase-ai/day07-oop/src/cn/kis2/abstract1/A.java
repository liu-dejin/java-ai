package cn.kis2.abstract1;

public abstract class A {
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public A() {
    }

    public A(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void show1() {
        System.out.println("show1");
    }

    // 抽象方法 没有方法体 只有方法声明 必须使用abstract修饰 抽象方法必须是抽象类 抽象类不一定有抽象方法
    public abstract void show();
}
