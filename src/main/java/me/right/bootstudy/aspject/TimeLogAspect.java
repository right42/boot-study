package me.right.bootstudy.aspject;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Slf4j
@Aspect
@Component
public class TimeLogAspect {

    @Around("@annotation(TimeLog)")
    public Object joinpoint(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        StopWatch stopWatch = new StopWatch();
        log.info("===============================");
        log.info("{} start ", proceedingJoinPoint.getSignature().getDeclaringTypeName());
        stopWatch.start();

        Object proceed = proceedingJoinPoint.proceed();

        stopWatch.stop();
        log.info("{} end", proceedingJoinPoint.getSignature().getDeclaringTypeName());
        log.info("total execute time : {}ms", stopWatch.getTotalTimeMillis());
        log.info("==============================");
        return proceed;
    }

}
