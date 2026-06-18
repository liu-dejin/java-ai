package cn.kis2.demo2map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTraverseDemo3 {
    static void main() {
        // 遍历1 键找值
        Map<String, Integer> map = new HashMap<>();
        map.put("张三", 18);
        map.put("老李", 10);
        map.put("王五", 18);


        // 提前map所有键提取到一个set
        Set<String> keys = map.keySet();
        // 遍历set 得到每一个键
        for (String key : keys) {
            Integer value = map.get(key);
            System.out.println(key + ":" + value);
        }
    }
}
