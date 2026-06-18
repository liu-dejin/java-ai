package cn.kis2.encapsulation;

public class Student {
    String name;
    double chinese;
    double math;
    // 1. 合理隐藏  private 本类中合理访问 其他任何地方不能访问
    private int age;

    // 2.合理暴露 public get set 方法 成员变量的取值和赋值
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printTotalScore() {
        System.out.println(name + "总成绩：" + (chinese + math));
    }

    public void printAvgScore() {
        System.out.println(name + "平均成绩：" + (chinese + math) / 2);
    }
}
