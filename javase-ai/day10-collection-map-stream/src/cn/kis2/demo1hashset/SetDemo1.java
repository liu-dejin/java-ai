package cn.kis2.demo1hashset;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {
    static void main() {
        // 创建一个set集合
        // Set<String> set = new HashSet<>(); // 经典代码 无序不重复无索引
        Set<String> set = new LinkedHashSet<>(); // 有序 不重复 无索引
        set.add("java");
        set.add("java");
        set.add("前端");
        set.add("python");
        System.out.println(set);

        // 2.创建一个 treeSet 排序 无重复 无索引
        Set<Double> treeSet = new TreeSet<>();
        treeSet.add(1.10);
        treeSet.add(1.01);
        treeSet.add(1.02);
        System.out.println(treeSet);

        System.out.println("=======================");
        String s1 = "abc";
        String s2 = "acb";

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
