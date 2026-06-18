package cn.kis2.demo3annotation;

import java.lang.reflect.Method;

public class AnnotationDemo4 {

    static void main() throws Exception {
        // 1.获取类对象
        // 2.获取所有方法
        // 3.遍历所有方法 判断是否有MyTest注解
        AnnotationDemo4 a = new AnnotationDemo4();
        Class c = AnnotationDemo4.class;
        Method[] methods = c.getMethods();
        // 遍历方法判断是否有MyTest注解
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyTest.class)) {
                MyTest MyTest = method.getAnnotation(MyTest.class);
                int count = MyTest.count();
                for (int i = 0; i < count; i++) {
                    method.invoke(a);
                }

            }
        }
    }

    // 注解 模拟junit框架
    public void test1() {
        System.out.println("test1");
    }

    @MyTest(count = 2)
    public void test2() {
        System.out.println("test2");

    }

    public void test3() {
        System.out.println("test3");

    }

    @MyTest
    public void test4() {
        System.out.println("test4");

    }
}
