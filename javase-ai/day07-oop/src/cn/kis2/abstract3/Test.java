package cn.kis2.abstract3;

public class Test {
    // 模板方法设计模式
    // 学生和老师都要写一篇作文功能 我的父亲
    // 第一段是一样的    我的爸爸是一个好人
    // 第二段是不同的    老师和学生各自写各自的
    // 第三段是一样的    我爸爸真好

    // 抽了一个父类 父类抽取一个模板方法
    static void main() {
        Student s = new Student();
        s.write();
    }
}
