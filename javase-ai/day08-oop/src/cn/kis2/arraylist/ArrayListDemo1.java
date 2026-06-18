package cn.kis2.arraylist;

import java.util.ArrayList;

public class ArrayListDemo1 {
    static void main() {
        // ArrayList 的 增删改查
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }

        list.remove(2);
        System.out.println(list);
        list.remove( "张三");
        System.out.println(list);
    }
}
