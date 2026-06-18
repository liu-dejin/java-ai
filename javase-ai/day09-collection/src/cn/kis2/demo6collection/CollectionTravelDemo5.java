package cn.kis2.demo6collection;

import java.util.ArrayList;
import java.util.function.Consumer;

public class CollectionTravelDemo5 {
    static void main() {
        // 遍历方式3
        ArrayList<String> names = new ArrayList<>();
        names.add("张无忌");
        names.add("周芷若");
        names.add("赵敏");
        names.add("张三丰");

        // names.forEach(new Consumer<String>() {
        //     @Override
        //     public void accept(String s) {
        //         System.out.println(s);
        //     }
        // });

        // names.forEach(s -> System.out.println(s));
        names.forEach(System.out::println);

    }
}
