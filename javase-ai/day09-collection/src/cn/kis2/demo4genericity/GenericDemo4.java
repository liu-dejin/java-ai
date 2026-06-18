package cn.kis2.demo4genericity;

import cn.kis2.demo3genericity.Student;
import cn.kis2.demo3genericity.StudentData;

public class GenericDemo4 {
    static void main() {
        // 泛型方法
        // 打印任意数组内容
        String[] names = {"赵敏", "张无忌"};
        printArray(names);

        printArray(new StudentData[3]);

        String max = getMax(names);
    }
    public static <T> void printArray(T[] array){

    }
    public static <T> T getMax(T[] array){
        return null;
    }
}
