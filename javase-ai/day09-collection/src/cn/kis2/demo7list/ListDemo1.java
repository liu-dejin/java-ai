package cn.kis2.demo7list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo1 {
    static void main() {
        // list 集合独有功能
        List<String> names = new ArrayList<>();

        // 添加数据
        names.add("hello");
        names.add("world");
        names.add("java");
        System.out.println(names);

        // 给第三个位置插入数据 前端
        names.add(2, "前端");
        System.out.println(names);

        // 删除java
        // names.remove("java");
        System.out.println(names.remove(3)); // 返回删除的数据
        System.out.println(names);

        // hello改成金毛
        names.set(1, "金毛");

        // 获取world
        System.out.println(names.get(1));


        // 1.for循环
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        // 2.迭代器
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 3.增强for
        for (String name : names) {
            System.out.println(name);
        }

        // lambda
        names.forEach(System.out::println);
    }
}
