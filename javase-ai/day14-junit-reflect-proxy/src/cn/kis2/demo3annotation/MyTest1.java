package cn.kis2.demo3annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // 表示注解保留策略在运行时保留
@Target({ElementType.METHOD,ElementType.TYPE}) // 表示注解可以用在方法 成员变量
public @interface MyTest1 {
}
