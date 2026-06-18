package cn.kis2.thisdemo;

public class Student {

    // 成员变量
    String name;
    int age;
    char sex;

    public void print() {
        // 那个对象调用这个方法，this就是那个对象
        System.out.println(this);
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.sex);
    }

    // 局部变量  this 防止冲突
    public void printHobby(String name) {
        this.name = name;
    }

}
