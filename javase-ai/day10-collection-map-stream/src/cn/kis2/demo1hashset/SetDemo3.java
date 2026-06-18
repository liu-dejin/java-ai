package cn.kis2.demo1hashset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo3 {
    static void main() {
        // treeSet 自定义对象排序
        // Set<Teacher> teachers = new TreeSet<>(new Comparator<Teacher>() {
        //     @Override
        //     public int compare(Teacher o1, Teacher o2) {
        //         // return o2.getAge()-o1.getAge();  // 降序
        //         // return o1.getSalary()>o2.getSalary()?1:o1.getSalary()<o2.getSalary()?-1:0;
        //         return Double.compare(o1.getSalary(), o2.getSalary()); //薪水升序
        //
        //     }
        // });

        // Set<Teacher> teachers = new TreeSet<>((o1, o2) -> {
        //
        //     return Double.compare(o1.getSalary(), o2.getSalary()); //薪水升序
        //
        // });

        Set<Teacher> teachers = new TreeSet<>(Comparator.comparingDouble(Teacher::getSalary));
        teachers.add(new Teacher("张三", 18, 5000));
        teachers.add(new Teacher("老李", 10, 5000));
        teachers.add(new Teacher("王五", 18, 5000));
        System.out.println(teachers);

        // treeSet 不能自定义对象排序
        // 一定要解决 两种方案

        // 1.对象类实现Comparable接口 重写compareTo方法 制定比较规则
        // 2.treeSet 自带比较器对象 Comparator 制定比较器

    }
}
