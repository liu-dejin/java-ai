package cn.kis2.demo6collection;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionDemo1 {
    static void main() {
        // Collection 集合
        // 1.List 集合 有序 可重复 有索引
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("world");
        list.add("java");
        System.out.println(list);
        System.out.println(list.get(1));
        // 1.set 集合 无序 不可重复 无索引
        HashSet<String> set = new HashSet<>();
        set.add("hello");
        set.add("hello");
        set.add("world");
        set.add("java");
        System.out.println(set);}
}
