package cn.kis2.demo4test;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo2 {
    static void main() {

        // 批量添加
        ArrayList<String > list = new ArrayList<>();
        Collections.addAll(list, "张三", "李四", "王五", "麻子");
        System.out.println(list);

        // 打乱
        Collections.shuffle(list);
        System.out.println(list);
    }

}
