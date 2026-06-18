package cn.kis2.demo3stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo4 {
    static void main() {
        // 终结方法 不会返回流
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("张三", 48, 5000));
        teachers.add(new Teacher("老李", 40, 6000));
        teachers.add(new Teacher("王五", 45, 2000));
        teachers.add(new Teacher("金老师", 40, 9000));

        teachers.stream().filter(t->t.getSalary()>5000).forEach(System.out::println);
        System.out.println("------------------------------------------------------------");
        System.out.println(teachers.stream().filter(t -> t.getSalary() > 5000).count());
        System.out.println("------------------------------------------------------------");

        // 最高
        Optional<Teacher> max = teachers.stream().max(Comparator.comparingDouble(Teacher::getSalary));
        Teacher maxTeacher = max.get();
        System.out.println(maxTeacher);

        // 最低
        Optional<Teacher> min = teachers.stream().min(Comparator.comparingDouble(Teacher::getSalary));
        Teacher minTeacher = min.get();
        System.out.println(minTeacher);

        System.out.println("------------------------------------------------------------");
        List<String> list = new ArrayList<>();
        list.add("周芷若");
        list.add("小昭");
        list.add("张无忌");
        list.add("张三丰");
        list.add("张三丰");

        // 流只能收集一次

        // 收集到集合或数组中
        Stream<String> z = list.stream().filter(name -> name.startsWith("张"));
        // 收集到list合集
        List<String> list1 = z.collect(Collectors.toList());
        System.out.println(list1);

        // HashSet<Object> set1 = new HashSet<>();
        // set1.addAll(list1);

        // 收集到set
        Stream<String> z1 = list.stream().filter(name -> name.startsWith("张"));
        Set<String> set = z1.collect(Collectors.toSet());
        System.out.println(set);

        Stream<String> z2 = list.stream().filter(name -> name.startsWith("张"));
        Object[] array = z2.toArray();
        System.out.println("数组："+Arrays.toString(array));

        // *收集到map
        Stream<Teacher> z3 = teachers.stream();
        // 收集到map
        // Map<String, Double> map = z3.collect(Collectors.toMap(Teacher::getName, Teacher::getSalary));
        Map<String, Double> map = teachers.stream().collect(Collectors.toMap(Teacher::getName, Teacher::getSalary));
        System.out.println(map);
    }
}
