package cn.kis2.demo3annotation;

public @interface A {
    String name();
    int age() default 18;
    String[] hobbies() default {"吃饭", "睡觉"};
}
