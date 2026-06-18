package cn.kis2.demo1hashset;

import java.util.HashSet;

public class SetDemo2 {
    static void main() {
        // Set去重
        Students s1 = new Students("张三", 19, "北京", "12345678");
        Students s2 = new Students("李四", 11, "上海", "12341278");
        Students s3 = new Students("张三", 19, "北京", "12345678");
        Students s4 = new Students("李四", 11, "上海", "12341278");

        HashSet<Students> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);

        System.out.println(set);
    }
}
