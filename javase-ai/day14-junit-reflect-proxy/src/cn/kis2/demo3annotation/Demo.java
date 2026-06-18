package cn.kis2.demo3annotation;

@MyTest2(value = "笔记本", price = 1000.0, Address = {"北京", "上海"})
public class Demo {
    @MyTest2(value = "手机", price = 1300.0, Address = {"北京", "上海"})
    static void main() {

    }

    @MyTest2(value = "电脑", price = 1000.0, Address = {"北京", "上海"})
    public static void go() {

    }
}
