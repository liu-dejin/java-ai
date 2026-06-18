package cn.kis2.demo2redlect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo2 {

    @Test
    public void getClassinfo()  {
        // 获取类的信息并操作
        Class c1 = Dog.class;
        System.out.println(c1.getName()); // 全类名
        System.out.println(c1.getSimpleName()); // Dog
    }
    // 获取类的构造器对象
    @Test
    public void getConstructor() throws Exception {
        // 1.获取class对象
        Class c1 = Dog.class;
        // 2.构造器
        Constructor[] cons = c1.getDeclaredConstructors();
        for (Constructor con : cons) {
            System.out.println(con.getName()+" "+con.getParameterCount());
        }

        // 3.获取单个构造器
        Constructor con = c1.getDeclaredConstructor(); // 无参构造器
        System.out.println(con.getName()+" "+con.getParameterCount());

        Constructor con2 = c1.getDeclaredConstructor(String.class, int.class); // 有参构造器
        System.out.println(con2.getName()+" "+con2.getParameterCount());

        // 获取构造器的作用依然是创建对象
        // 反射暴力破解
        con.setAccessible(true); // 绕过访问权限 直接访问
        Dog d1 = (Dog) con.newInstance();
        System.out.println(d1);

        con2.setAccessible(true);
        Dog d2 = (Dog) con2.newInstance("旺财", 2);
        System.out.println(d2);

    }

    // 获取成员变量
    @Test
    public void getField() throws Exception {
        Class c1 = Dog.class;
        Field[] fields = c1.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName()+" "+field.getType());
        }
        // 获取单个成员变量
        Field field = c1.getDeclaredField("name");
        System.out.println("name:"+field.getName()+" "+field.getType());

        Field field2 = c1.getDeclaredField("hobby");
        System.out.println("name:"+field.getName()+" "+field.getType());
        // 成员变量 获取成员变量 取值赋值
        Dog d1 = new Dog("旺财",3);
        field2.setAccessible(true);
        field2.set(d1,"吃饭");
        System.out.println(d1);

        String hobby = (String) field2.get(d1);
        System.out.println(hobby);

    }

    // 获取成员方法
    @Test
    public void getMethod() throws Exception {
        Class c1 = Dog.class;
        Method[] methods = c1.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + " " + method.getParameterCount());
        }

        // 获取单个方法
        Method method = c1.getDeclaredMethod("eat");
        Method method2 = c1.getDeclaredMethod("eat",String.class);
        System.out.println(method.getName() + " " + method.getParameterCount());
        System.out.println(method2.getName() + " " + method2.getParameterCount());

        // 获取成员方法的目的还是调用方法
        Dog dog = new Dog("旺财",12);
        method.setAccessible(true);
        Object res1 = method.invoke(dog);
        System.out.println(res1);
        Object res2 = method2.invoke(dog, "骨头");
        System.out.println(res2);
    }
}
