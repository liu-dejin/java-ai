package cn.kis2.demo2map;

import java.util.*;

public class MapTest6 {
    static void main() {
        // map集合案例
        calc();
    }

    public static void calc(){
        // 80个景点数据拿到程序中来 才可以统计
        List<String> locations = new ArrayList<>();
        String[] name = {"上海", "北京", "广州", "深圳"};
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(name.length);
            locations.add(name[index]);
        }
        System.out.println(locations);

         // 2.统计想去的景点
        Map<String, Integer> map = new HashMap<>();

        for (String location : locations) {
            // 判断当前遍历的景点是否在map集合中 第一次/统计过
            // if(map.containsKey(location)){
            //     // 值加一
            //     map.put(location, map.get(location)+1);
            // }else {
            //     // 存入景点值为1
            //     map.put(location, 1);
            // }

            map.put(location, map.containsKey(location) ? map.get(location) + 1 : 1);
        }
        map.forEach((k, v) -> System.out.println(k + ":" + v));

        // 统计最多人数
        int maxCount = Collections.max(map.values());
        map.forEach((k, v) -> {
            if (v == maxCount) {
                System.out.println(k + "最多去" + v + "次");
            }
        });
    }
}
