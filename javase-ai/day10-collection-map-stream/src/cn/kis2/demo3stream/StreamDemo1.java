package cn.kis2.demo3stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {
    static void main() {
        // 认识stream流
        List<String> list = new ArrayList<>();
        list.add("周芷若");
        list.add("小昭");
        list.add("张无忌");
        list.add("张三丰");
        // 找出姓张的三字 存入到一个新集合
        // ArrayList<String> newList = new ArrayList<>();
        // for (String name : list) {
        //    if(name.startsWith("张")&&name.length()==3){
        //        newList.add(name);
        //    }
        // }
        // System.out.println(newList);

        // Stream流
        List<String> newList2 = list.stream().
                filter(name -> name.startsWith("张")).
                filter(name -> name.length() == 3).
                collect(Collectors.toList());
        System.out.println(newList2);
    }
}
