package net.xdclass.sp.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
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

    /**
     * 环绕通知
     *
     * @param joinPoint
     */
    @Around("aspect()")
    public void around(JoinPoint joinPoint) {


        Object obj = joinPoint.getTarget().getClass().getName();
        System.out.println("调用者=" + obj);
        //目标方法签名
        System.out.println("调用方法=" + joinPoint.getSignature());
        //通过j获取oinPoint参数
        Object[] args = joinPoint.getArgs();
        System.out.println("目标参数=" + args[0]);


        long start = System.currentTimeMillis();
        System.out.println("环绕通知 环绕前====================");
        //执行连接点方法
        try {
            ((ProceedingJoinPoint) joinPoint).proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("环绕通知 环绕后====================");
        long end = System.currentTimeMillis();
        System.out.println("方法前后调用总耗时=" + (end - start));


    }


}