package cn.kis2.demo2map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    static void main() {
        // 掌握map集合常用方法
        Map<String, Integer> map = new HashMap<>();
        map.put("张三", 18);
        map.put("王五", 18);
        map.put("老李", 18);
        System.out.println(map);

        // 常用方法
        System.out.println(map.get("张三")); // 18
        System.out.println(map.get("张三2")); // null
        System.out.println(map.containsKey("张三"));
        System.out.println(map.containsValue(18));

        System.out.println(map.isEmpty()); // 判断map集合是否为空
        System.out.println(map.remove("张三")); // 根据key删除键值对
        System.out.println(map);
        System.out.println(map.size());
        // map.clear();// 清空map集合

        Set<String> keys = map.keySet();
        System.out.println(keys);

        // 获取所有的值
        Collection<Integer> values = map.values();
        System.out.println(values);
    }
}
