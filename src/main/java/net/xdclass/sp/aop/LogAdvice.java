package net.xdclass.sp.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @description: 切面
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/2/18 23:14
 */
@Component
//切面注解，可以定义切入点和通知
@Aspect
public class LogAdvice {

    //切入点表达式（也可以直接在通知上编写切入表达式）
    @Pointcut("execution(* net.xdclass.sp.service.impl.VideoServiceImpl.*(..))")
    public void aspect() {

    }

    //前置通知
    @Before("aspect()")
    public void beforeLog(JoinPoint joinPoint) {
        System.out.println("LogAdvice beforeLog");
    }


    //后置通知
    @After("aspect()")
    public void afterLog(JoinPoint joinPoint) {
        System.out.println("LogAdvice afterLog");
    }


}
