package cn.kis2.demo3annotation;

public @interface B {
    String value();
    String name() default "张三";
}
