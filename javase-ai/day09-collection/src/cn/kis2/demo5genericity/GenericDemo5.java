package cn.kis2.demo5genericity;

import java.util.ArrayList;

public class GenericDemo5 {
    static void main() {
        // 泛型和集合不支持基本数据类型
        // ArrayList<double> list = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        // 泛型的可擦除   只工作在编译类型  编译之后都会被擦除 变成object

        // 基本数据类型包装包装类对象
        // Integer i = new Integer(100);
        // 手工包装
        Integer i1 = Integer.valueOf(130);
        Integer i2 = Integer.valueOf(130);
        System.out.println(i1==i2);

        // 自动装箱：基本数据类型可以直接变成包装对象的数据 不需要做什么

        // 自动拆箱：包装类型对象直接给基本类型的数据

        int i = i1;
        System.out.println(i);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100); // 自动装箱
        list2.add(100); // 自动装箱
        list2.add(100); // 自动装箱
        list2.add(100); // 自动装箱
        list2.add(100); // 自动装箱

        int rs = list2.get(1);

        System.out.println("==================================================================================");
        // 新增的方法
        // 基本类型数据转字符串
        int j = 100;
        String s = Integer.toString(j);
        System.out.println(s);

        Integer j2 = j;
        String s2 = j2.toString();
        System.out.println(s2);

        String s3 = j + "";
        System.out.println(s3);

        // 字符串转基本数据类型
        String s4 = "98";
        int i3 = Integer.valueOf(s4);
        System.out.println(i3+2);

        String s5 = "98.111";
        double d = Double.valueOf(s5);
        System.out.println(d+2);


    }
}
