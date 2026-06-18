package cn.kis2.demo2map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTraverseDemo4 {
    static void main() {
        // 遍历2
        Map<String, Integer> map = new HashMap<>();
        map.put("张三", 18);
        map.put("老李", 10);
        map.put("王五", 18);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
