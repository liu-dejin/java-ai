package cn.kis2.javabean;

public class Student {

    // 私有变量
    private String name;
    private int age;
    private char sex;
    private int chines;
    private int math;
    private int english;

    public Student(int chines, int english, int math) {
        this.chines = chines;
        this.english = english;
        this.math = math;
    }
// get set 方法


    public Student() {
    }

    // 有参构造器
    public Student(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getChines() {
        return chines;
    }

    public void setChines(int chines) {
        this.chines = chines;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }
}
