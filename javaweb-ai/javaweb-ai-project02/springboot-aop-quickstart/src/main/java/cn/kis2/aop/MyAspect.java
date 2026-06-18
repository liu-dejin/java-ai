package cn.kis2.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Slf4j
@Component
// @Aspect
public class MyAspect {

    @Pointcut("execution(* cn.kis2.service.impl.*.*(..))")
    private void pt(){

    }

    // 前置通知 目标方法运行之前通知
    @Before("pt()")
    public void before() {
        log.info("before");
    }

    // 环绕通知 前后都允许
    @Around("pt()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        log.info("around__before");

        Object result = pjp.proceed();

        log.info("around__after");
        return result;

    }

    // 后置通知 运行之后运行无论失败与否 运行之后都会运行
    @After("pt()")
    public void after() {
        log.info("after");
    }

    // 方法之后运行 遇到异常不会运行
    @AfterReturning("pt()")
    public void AfterReturning() {
        log.info("AfterReturning");
    }

    // 异常才会运行
    @AfterThrowing("pt()")
    public void AfterThrowing() {
        log.info("AfterThrowing");
    }
}
