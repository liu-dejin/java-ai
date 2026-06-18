package cn.kis2.demo4genericity;

import java.util.ArrayList;

public class GenericDemo5 {
    static void main() {
        // 通配符和上下限
        ArrayList<Xiaomi> xiaomi = new ArrayList<>();
        xiaomi.add(new Xiaomi());
        xiaomi.add(new Xiaomi());
        xiaomi.add(new Xiaomi());
        go(xiaomi);

        ArrayList<BYD> byds = new ArrayList<>();
        byds.add(new BYD());
        byds.add(new BYD());
        byds.add(new BYD());
        go(byds);

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        // go(dogs);
    }
    // 极品飞车
    // 虽然Xiaomi和byd 是Car的字类 但是 ArrayList<Xiaomi> 和 ArrayList<byd> 没关系
    public static void go (ArrayList<? extends Car> cars){

    }
}
