package com.baixue.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class MyAspect {

/*    @Before("execution(* com.baixue.service.UserServiceImpl.*(..))")
    public void before(JoinPoint joinPoint){
        System.out.println("======Before===========");
    }*/

    @Around("execution(* com.baixue.service.UserServiceImpl.*(..))")
    public Object aroud(ProceedingJoinPoint pjp){
        try {
            System.out.println("aroud before============");
            Object proceed = pjp.proceed();
            System.out.println("aroud after ==============");
            return proceed;
        } catch (Throwable throwable) {
            System.out.println("exception ============");
            throwable.printStackTrace();
        }
        return null;
    }
}
