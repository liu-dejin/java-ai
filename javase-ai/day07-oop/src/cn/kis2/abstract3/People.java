package cn.kis2.abstract3;

public abstract class People {
    public final void write() {
        System.out.println("我的爸爸是一个好人");
        // 每个子类第二段不同 父类定义一个抽象方法
        // System.out.println("我爸爸是个manage");
        writeMain();
        System.out.println("我爸爸真好");
    }
    public abstract void writeMain();
}
