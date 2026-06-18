package cn.kis2.demo6collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionDemo2 {
    static void main() {
        // Collection 集合
        Collection<String> list = new ArrayList<>();
        list.add("collection");
        list.add("list");
        list.add("set");

        System.out.println(list);

        // 获取集合个数
        System.out.println(list.size());
        // 删除集合元素
        list.remove("list");
        System.out.println(list);

        // 判断集合是否为空
        System.out.println(list.isEmpty()); //  false

        // 清空集合
        // list.clear();
        System.out.println(list);

        // 判断集合中是否存在某个数据
        System.out.println(list.contains("list")); // false

        Object[] arr = list.toArray();
        System.out.println(Arrays.toString(arr));

        String[] arr1 = list.toArray(String[]::new);
        System.out.println(Arrays.toString(arr1));
    }
}
