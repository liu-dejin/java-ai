package cn.kis2.demo6collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTravelDemo3 {
    static void main() {
        // 迭代器遍历        遍历方式1
        ArrayList<String> names = new ArrayList<>();
        names.add("张无忌");
        names.add("周芷若");
        names.add("赵敏");
        names.add("张三丰");
        System.out.println(names); //[张无忌, 周芷若, 赵敏, 张三丰]
        //                              it

        // 1.迭代器对象
        Iterator<String> it = names.iterator();
        // System.out.println(it.next());
        // System.out.println(it.next());
        // System.out.println(it.next());
        // System.out.println(it.next());

        // while 循环遍历
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
