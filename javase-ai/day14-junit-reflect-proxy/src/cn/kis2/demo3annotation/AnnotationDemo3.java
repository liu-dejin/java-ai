package cn.kis2.demo3annotation;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;


public class AnnotationDemo3 {
    @Test
    public void parseClass() throws Exception {
        Class c1 = Demo.class;
        //  判断是否有MyTest注解
        if (c1.isAnnotationPresent(MyTest2.class)) {
            MyTest2 myTest2 = (MyTest2) c1.getDeclaredAnnotation(MyTest2.class);

            System.out.println(myTest2.value());
            System.out.println(myTest2.price());
            System.out.println(Arrays.toString(myTest2.Address()));
        }
    }

    @Test
    public void parseMethod() throws Exception {
        // 1.提取类对象
        Class c1 = Demo.class;

        // 2.获取方法对象
        Method method = c1.getMethod("go");
        // 判断
        if (method.isAnnotationPresent(MyTest2.class)) {
        }
        MyTest2 myTest2 = method.getDeclaredAnnotation(MyTest2.class);
        System.out.println(myTest2.value());
        System.out.println(myTest2.price());
        System.out.println(Arrays.toString(myTest2.Address()));
    }

}
