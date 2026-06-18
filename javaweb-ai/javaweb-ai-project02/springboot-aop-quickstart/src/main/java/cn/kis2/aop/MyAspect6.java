package cn.kis2.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Aspect
@Order(4)
public class MyAspect6 {

    @Before("execution(* cn.kis2.service.*.*(..))")
    public void before(JoinPoint joinPoint){
        log.info("MyAspect4 -> before ...");
        // 1.获取目标对象
        Object target = joinPoint.getTarget();
        log.info("target:{}",target);
        // 2.获取目标类
        String classname = joinPoint.getTarget().getClass().getName();
        log.info("classname:{}",classname);
        // 3.获取目标方法
        String methodName = joinPoint.getSignature().getName();
        log.info("methodName:{}",methodName);
        // 4.获取目标方法参数
        Object[] args = joinPoint.getArgs();
        log.info("args:{}",args);
    }
    @Around("execution(* cn.kis2.service.*.*(..))")
    public Object around (ProceedingJoinPoint pjp) throws Throwable {
        log.info("before");
        Object result = pjp.proceed();
        log.info("after");
        return result;
    }



}
