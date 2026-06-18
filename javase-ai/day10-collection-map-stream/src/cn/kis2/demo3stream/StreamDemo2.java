package cn.kis2.demo3stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo2 {
    // 获取stream流
    static void main(String[] args) {
        // 获取集合的stream流 集合.stream()
        Collection<String> list = new ArrayList<>();
        Stream<String> s1 = list.stream();

        // map集合
        Map<String, String> map = new HashMap<>();

        // 键流
        Stream<String> s2 = map.keySet().stream();
        // 值流
        Stream<String> s3 = map.values().stream();

        // 键值对流
        Stream<Map.Entry<String, String>> s4 = map.entrySet().stream();

        // 获取数组的流
        String[] arr = {"张三", "小昭", "小昭", "小昭"};
        Stream<String> s5 = Arrays.stream(arr);
        System.out.println(s5.count());

        Stream<String> s6 = Stream.of("张三", "小昭", "小昭", "小昭");

        System.out.println(s6.count());

        Stream.of("张三丰", "张无忌");
    }
}
