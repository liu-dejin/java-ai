package cn.kis2.demo3stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo3 {
    static void main() {
        // 中间方法 返回新流 链式调用
        List<String> list = new ArrayList<>();
        list.add("周芷若");
        list.add("小昭");
        list.add("张无忌");
        list.add("张三丰");
        list.add("张翠山");

        // 1.过滤方法
        list.stream().filter(name -> name.startsWith("张") && name.length() == 3).forEach(System.out::println);
        // 2.排序方法
        List<Double> scores = new ArrayList<>();
        scores.add(90.0);
        scores.add(80.0);
        scores.add(100.0);
        scores.add(100.0);
        scores.add(60.0);
        scores.stream().sorted().forEach(System.out::println); // 默认升序
        System.out.println("----------------------------------");
        scores.stream().sorted(Double::compare).forEach(System.out::println); // 降序
        System.out.println("----------------------------------");
        scores.stream().sorted((o1, o2) -> Double.compare(o2, o1)).limit(2).forEach(System.out::println); // 降序只要前两名

        System.out.println("----------------------------------");
        scores.stream().sorted((o1, o2) -> Double.compare(o2, o1)).skip(2).forEach(System.out::println); // 降序跳过前两名


        // 如果自定义对象能够去重 必须重写hashcode 和 equals

        System.out.println("----------------------------------");
        scores.stream().sorted((o1, o2) -> Double.compare(o2, o1)).distinct().forEach(System.out::println); // 去重复

        // map 加工方法
        scores.stream().map(score -> score + 10).forEach(System.out::println);

        // 合并 方法
        Stream<String> arr1 = Stream.of("张三", "小昭", "小昭", "小昭");
        Stream<Integer> arr2 = Stream.of(10, 20, 30, 40);
        Stream<Object> c = Stream.concat(arr1, arr2);
        System.out.println(c.count());

    }
}
