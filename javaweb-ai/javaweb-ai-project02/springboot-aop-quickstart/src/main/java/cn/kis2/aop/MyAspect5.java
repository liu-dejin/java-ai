package cn.kis2.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Slf4j
@Component
// @Aspect
@Order(4)
public class MyAspect5 {
    //前置通知
    // @Before("execution(public void cn.kis2.service.impl.DeptServiceImpl.delete(java.lang.Integer)))")
    // @Before("execution( void delete(java.lang.Integer)))") // 不建议省略
    // @Before("execution(* cn.*.service.impl.*.*e(*)))")
    // @Before("execution(* cn..service.impl.DeptServiceImpl.*(..)))")

    // @Before("execution(* cn..service.*.*(..)))")

    // 匹配 list和delect方法
    // @Before("execution(* cn.kis2.service.impl.DeptServiceImpl.list(..)) ||" +
    //         "execution(* cn.kis2.service.impl.DeptServiceImpl.delete(..))  ")
    @Before("@annotation(cn.kis2.anno.LogOperation)")
    public void before(){
        log.info("MyAspect4 -> before ...");
    }


}
