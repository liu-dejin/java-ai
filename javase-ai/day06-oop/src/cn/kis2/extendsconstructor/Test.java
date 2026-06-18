package cn.kis2.extendsconstructor;

public class Test {
    static void main() {
        // 子类构造器 必须先调用父类的构造器 再执行自己的构造器
        Zi zi = new Zi();
    }
}
class Zi extends Fu{
    public Zi() {
        super(); // 默认存在,写不写都有 他会调用父类的无参构造器     如果父类没有无参构造器 必须手写super(...) 指定去调用父类的有参构造
        // super(6666); // 指定调用父类的有参
        System.out.println("子类无参构造器");
    }
}
class Fu{
    public Fu() {
        System.out.println("父类无参构造器");
    }
    public Fu(int a) {
        System.out.println("父类有参构造器");
    }
}
