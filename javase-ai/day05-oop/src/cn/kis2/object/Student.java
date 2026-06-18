package cn.kis2.object;

public class Student {
    // 属性和方法写在一起
    String name;
    double chinese;
    double math;
    public void print() {
        System.out.println(name + "总成绩：" + (chinese + math));
        System.out.println(name + "平均成绩：" + (chinese + math) / 2);
    }
}
