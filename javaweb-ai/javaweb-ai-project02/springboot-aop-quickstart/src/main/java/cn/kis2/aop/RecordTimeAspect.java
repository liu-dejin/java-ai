package cn.kis2.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Slf4j
// @Aspect //标识是一个aop类
public class RecordTimeAspect  {


    @Around("execution(* cn.kis2.service.impl.*.*(..))")
    public Object recordTime(ProceedingJoinPoint pjp) throws Throwable {

        // 记录开始时间
        long begin = System.currentTimeMillis();

        // 执行方法
        Object result = pjp.proceed();

        // 记录结束时间
        long end = System.currentTimeMillis();
        log.info("方法{}耗时:{}ms", pjp.getSignature(),end - begin);

        return result;
    }
}
