package cn.kis2.demo6collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionTravelDemo6 {
    static void main() {
        // 并发修改异常的问题 每种遍历的区别
        ArrayList<String> list = new ArrayList<>();
        list.add("java入门");
        list.add("java集合");
        list.add("java多线程");
        list.add("java数据库");
        list.add("前端");
        list.add("前端js");
        System.out.println(list);


        // 1.删除全部前端
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if (name.contains("前端")) {
                list.remove(name);
            }
        }
        System.out.println(list);

        // [java入门, java集合, java多线程, java数据库, 前端, 前端js]
        // [java入门, java集合, java多线程, java数据库, 前端js]
        System.out.println("======================================");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("java入门");
        list2.add("java集合");
        list2.add("java多线程");
        list2.add("java数据库");
        list2.add("前端");
        list2.add("前端js");
        System.out.println(list2);


        // 1.删除全部前端
        for (int i = 0; i < list2.size(); i++) {
            String name = list2.get(i);
            if (name.contains("前端")) {
                list2.remove(name);
                i--;
            }
        }
        System.out.println(list2);
        System.out.println("===========================");
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("java入门");
        list3.add("java集合");
        list3.add("java多线程");
        list3.add("java数据库");
        list3.add("前端");
        list3.add("前端js");
        System.out.println(list3);


        // 1.删除全部前端
        for (int i = list3.size()-1 ; i >= 0; i--) {
            String name = list3.get(i);
            if (name.contains("前端")) {
                list3.remove(name);

            }
        }
        System.out.println(list3);

        System.out.println("=============================================================");
        ArrayList<String> list4 = new ArrayList<>();
        list4.add("java入门");
        list4.add("java集合");
        list4.add("java多线程");
        list4.add("java数据库");
        list4.add("前端");
        list4.add("前端js");
        System.out.println(list4);


        // 迭代器遍历并删除     存在并发修改异常问题
        // 使用迭代器自己的方法删除
        Iterator<String> it = list4.iterator();
        while (it.hasNext()) {
            String name = it.next();
            if (name.contains("前端")) {
                it.remove();
            }
        }
        System.out.println(list4);
        System.out.println("=============================================================");
        ArrayList<String> list5 = new ArrayList<>();
        list5.add("java入门");
        list5.add("java集合");
        list5.add("java多线程");
        list5.add("java数据库");
        list5.add("前端");
        list5.add("前端js");
        System.out.println(list5);


        // 并发修改异常问题
        // 增强for和lambda都无法解决
       // for (String name : list5) {
       //      if (name.contains("前端")) {
       //          list5.remove(name);
       //      }
       //  }
        list5.forEach(s->{
            if (s.contains("前端")) {
                list5.remove(s);
            }
        });
        System.out.println(list5);
    }
}
