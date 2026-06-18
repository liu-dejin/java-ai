package cn.kis2.demo2map;

import java.util.HashMap;
import java.util.Map;

public class MapTraverseDemo5 {
    static void main() {
        // 遍历3 lambda
        Map<String, Integer> map = new HashMap<>();
        map.put("张三", 18);
        map.put("老李", 10);
        map.put("王五", 18);

       map.forEach((k, v) -> System.out.println(k + ":" + v));
    }
}
