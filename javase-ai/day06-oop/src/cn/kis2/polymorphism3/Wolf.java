package cn.kis2.polymorphism3;

public class Wolf extends Animal {

    String name = "狼";
    @Override
    public void run() {
        System.out.println("跑得快");
    }

    public void attack() {
        System.out.println("吃羊");
    }
}
