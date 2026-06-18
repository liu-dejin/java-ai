package cn.kis2.demo2genericity;

import java.util.ArrayList;

public class GenericDemo1 {
    static void main() {
        // 认识泛型     具体的数据类型作为参数传给类型变量
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");

        // list.add(1);
        // list.add(true);
        // list.add(new Object());
        // System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            String l = list.get(i);
            System.out.println(l);
        }
    }
}
