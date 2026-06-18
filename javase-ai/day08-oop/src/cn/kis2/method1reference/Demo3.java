package cn.kis2.method1reference;

import java.util.Arrays;
import java.util.Comparator;

public class Demo3 {
    static void main() {
        // 特定方法引用
        // 有一个字符串数组 一堆人名字 按照名字首字母升序排序
        String[] names = {"David", "Dob", "And", "frank", "candy", "elaine"};

        // 排序
        // Arrays.sort(names);
        // 忽略首字母大小写（默认不支持）

        // 特定方法引用  类型名称::方法名
        Arrays.sort(names, String::compareToIgnoreCase); // java 提供了首字母比较的方法 忽略大小写 compareToIgnoreCase);
        System.out.println(Arrays.toString(names));
    }
}
