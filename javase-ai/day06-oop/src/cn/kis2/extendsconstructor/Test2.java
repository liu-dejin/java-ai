package cn.kis2.extendsconstructor;

public class Test2 {
    static void main() {
        // 子类调用父类应用场景
        // 子类构造器可以通过调用父类构造器，把对象中包含父类这部分的数据先初始化赋值，
        // 再回来把对象里包含子类这部分的数据也进行初始化赋值。
        Teacher t = new Teacher("de","java",'男');
        System.out.println(t.getName());
        System.out.println(t.getSkill());
        System.out.println(t.getSex());
    }
}
