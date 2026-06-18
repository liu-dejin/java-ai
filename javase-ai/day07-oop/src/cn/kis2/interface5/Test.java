package cn.kis2.interface5;

public class Test {
    public static void main(String[] args) {
        System.out.println("--- 特点3：类优先原则 ---");
        Child c = new Child();
        c.test();

        System.out.println("\n--- 特点4：接口冲突重写 ---");
        Artist artist = new Artist();
        artist.perform();
    }
}

// 1. 接口与接口：多继承
interface Swim {
    void swimming();
}

interface Fly {
    void flying();
}

// 接口多继承：A 接口继承了 B 和 C
interface Skill extends Swim, Fly {
    void totalSkill();
}

// 实现类必须实现所有祖先接口的方法
class Superhero implements Skill {
    @Override public void swimming() { System.out.println("在水里游"); }
    @Override public void flying() { System.out.println("在天上飞"); }
    @Override public void totalSkill() { System.out.println("全能技能"); }
}
// 2.方法签名冲突（规范合并）
interface Runner {
    void run(); // 抽象方法
}

interface Athlete {
    void run(); // 抽象方法，签名与 Runner 冲突但由于是抽象的，可以合并
}

class Person implements Runner, Athlete {
    // 只需要实现一个 run() 即可满足两个接口
    @Override
    public void run() {
        System.out.println("跑步中...");
    }
}

// 3.优先级规则：类优先于接口
interface InterfaceA {
    default void message() {
        System.out.println("接口 A 的默认消息");
    }
}

class Parent {
    public void message() {
        System.out.println("父类的消息");
    }
}

// 继承父类并实现接口
class Child extends Parent implements InterfaceA {
    // 此时不需要重写，默认调用 Parent 的 message()
    public void test() {
        message();            // 输出：父类的消息
        super.message();      // 指向父类
        InterfaceA.super.message(); // 如果想用接口的，需显式指定
    }
}

// 4. 默认方法冲突：必须重写
interface Singer {
    default void perform() {
        System.out.println("唱歌表演");
    }
}

interface Dancer {
    default void perform() {
        System.out.println("跳舞表演");
    }
}

class Artist implements Singer, Dancer {
    // 必须重写 perform() 以解决两个 default 方法的冲突
    @Override
    public void perform() {
        System.out.println("艺术家的综合表演：");
        Singer.super.perform(); // 调用 Singer 的默认实现
        Dancer.super.perform(); // 调用 Dancer 的默认实现
    }
}
