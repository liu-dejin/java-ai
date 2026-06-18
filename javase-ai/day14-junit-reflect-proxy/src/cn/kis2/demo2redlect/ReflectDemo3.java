package cn.kis2.demo2redlect;


import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectDemo3 {
    static void main() throws Exception {
        // 获取类的全部成分
        // 破坏封装性
        // 绕过泛型约束
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        // list.add(100);

        Class c1 = list.getClass(); //c1== ArrayList.class
        Method add = c1.getDeclaredMethod("add", Object.class);
        // 触发list集合的add方法
        add.invoke(list, 9.9);
        add.invoke(list, true);

        System.out.println(list);
    }
}
