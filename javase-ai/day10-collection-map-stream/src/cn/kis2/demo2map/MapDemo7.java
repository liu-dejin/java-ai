package cn.kis2.demo2map;

import cn.kis2.demo1hashset.Teacher;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo7 {
    static void main() {
        // TreeMap
        Map<Teacher, String> map = new TreeMap<>(Comparator.comparingDouble(Teacher::getSalary)); // 按照键排序
        map.put(new Teacher("张三", 18, 5000), "423");
        map.put(new Teacher("老四", 11, 5000), "422");
        map.put(new Teacher("老2", 15, 5000), "422");
        System.out.println(map);
    }
}
