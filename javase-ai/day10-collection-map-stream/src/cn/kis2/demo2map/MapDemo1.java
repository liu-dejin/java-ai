package cn.kis2.demo2map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo1 {
    static void main() {
        // 认识map/hashmap集合 体系特点     无序不重复无索引  键值对都可以是null 值不做要求
        // LinkedHashMap  有序不重复无索引  键值对都可以是null 值不做要求
        // TreeHashMap  按键排序，不重复无索引
        // Map<String, Integer> map = new HashMap<>(); // 经典代码
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        // 存数据
        map.put("张三", 18);
        map.put("李四", 19);
        map.put("王五", 20);
        map.put("张三", 12);
        map.put("吴九", 24);
        map.put("铁扇公主", 24);
        System.out.println(map);
    }}
