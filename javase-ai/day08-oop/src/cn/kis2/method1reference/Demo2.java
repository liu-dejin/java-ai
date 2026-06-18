package cn.kis2.method1reference;

import java.util.Arrays;

public class Demo2 {
    // 实例方法引用
    static void main() {
        test();
    }

    public static void test() {
        Student[] students = new Student[6];
        students[0] = new Student("张三", 18, 180, '男');
        students[1] = new Student("王五", 19, 170, '男');
        students[2] = new Student("赵六", 20, 160, '女');
        students[3] = new Student("孙七", 17, 190, '男');
        students[4] = new Student("周八", 16, 150, '女');
        students[5] = new Student("吴九", 18, 180, '男');

        // 实例方法引用
        Student t = new Student();
        Arrays.sort(students, t::compareByHeight);
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s);
        }
    }
}
