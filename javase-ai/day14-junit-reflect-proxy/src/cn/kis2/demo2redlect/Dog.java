package cn.kis2.demo2redlect;

import lombok.Data;

@Data
public class Dog {

    private String name;
    private int age;
    private String hobby;


    private Dog() {
        System.out.println("无参构造器");
    }


    public Dog(String name, int age) {
        System.out.println("有参构造器 2参数");
        this.name = name;
        this.age = age;
    }

    public Dog(String name) {
        System.out.println("有参构造器 1参数");
        this.name = name;
    }
    private  Dog(String name, int age , String hobby) {
        System.out.println("有参构造器 3参数");
        this.name = name;
        this.age = age;
        this.hobby = hobby;

    }

    public String eat() {
        System.out.println("狗吃东西");
        return "谢谢";
    }
    public void eat(String food) {
        System.out.println("狗吃" +food);
    }
}
