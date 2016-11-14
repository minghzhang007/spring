package com.lewis.springAnno.ch1.aop;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/11/14.
 */
@Aspect
@Component

public class LogAspect {

    @Pointcut(value = "@annotation(com.lewis.springAnno.ch1.aop.Action) ")
    public void annotationPoinCut(){}

    @Around(value = "annotationPoinCut()")
    public void after(ProceedingJoinPoint joinpoint){
        if (joinpoint instanceof ProceedingJoinPoint) {
            ProceedingJoinPoint proceedingJoinPoint = (ProceedingJoinPoint)joinpoint;
            Signature signature = proceedingJoinPoint.getSignature();
            if (signature instanceof MethodSignature) {
                MethodSignature methodSignature = (MethodSignature)signature;
                Method method = methodSignature.getMethod();
                Action annotation = method.getAnnotation(Action.class);
                System.out.println("注解式拦截 "+annotation.name());
            }
        }
    }

    @Around(value = "execution(* com.lewis.springAnno.ch1.aop.DemoMethodService.*(..))")
    public void before(ProceedingJoinPoint joinpoint){
        if (joinpoint instanceof ProceedingJoinPoint) {
            ProceedingJoinPoint proceedingJoinPoint = (ProceedingJoinPoint)joinpoint;
            Signature signature = proceedingJoinPoint.getSignature();
            if (signature instanceof MethodSignature) {
                MethodSignature methodSignature = (MethodSignature)signature;
                Method method = methodSignature.getMethod();
                System.out.println("方法规则式拦截 "+method.getName());
            }
        }
    }



}
