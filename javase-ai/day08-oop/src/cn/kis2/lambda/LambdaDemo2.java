package cn.kis2.lambda;

import cn.kis2.innerclass3.Student;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo2 {
    static void main() {
        // 简化示例
        // 数据排序.理解匿名内部类
        Student[] students = new Student[6];
        students[0] = new Student("张三", 18, 180, '男');
        students[1] = new Student("王五", 19, 170, '男');
        students[2] = new Student("赵六", 20, 160, '女');
        students[3] = new Student("孙七", 17, 190, '男');
        students[4] = new Student("周八", 16, 150, '女');
        students[5] = new Student("吴九", 18, 180, '男');

        // 按照年龄升序排序 public static <T> void sort(T[] a, Comparator<? super T> c)
        // 参数一 需要排序的数组
        // 参数二 sort 声明比较器对象(指定排序规则）
        // sort 会调用内部类的compare方法 对数组的学生对象两两对比 实现排序
        // Arrays.sort(students, (Student o1, Student o2)-> {
        //     // 指定排序规则
        //     // 左边对象大于右边 返回正整数
        //     // 左边对象小于右边 返回负整数
        //     // 左边对象等于右边 返回0
        //
        //     return o1.getAge()-o2.getAge();
        //
        //     // if (o1.getAge() > o2.getAge()) {
        //     //     return 1;
        //     // } else if (o1.getAge() < o2.getAge()) {
        //     //     return -1;
        //     // } 升序
        //     // return 0;
        // });
        Arrays.sort(students, ( o1,  o2)-> o1.getAge()-o2.getAge());

        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s);
        }
    }
}
