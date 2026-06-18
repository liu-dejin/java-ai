package cn.kis2.demo6collection;

import java.util.ArrayList;

public class CollectionTravelDemo4 {
    static void main() {
        ArrayList<String> names = new ArrayList<>();
        names.add("张无忌");
        names.add("周芷若");
        names.add("赵敏");
        names.add("张三丰");

        for (String name : names){
            System.out.println(name);
        }


        // 还可以遍历数组  遍历方式2
        String[] users = {"张无忌", "尹素素"};
        for (String user : users){
            System.out.println(user);
        }
    }
}
