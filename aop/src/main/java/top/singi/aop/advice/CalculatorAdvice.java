package top.singi.aop.advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CalculatorAdvice {

    @Before("execution(* top.singi.aop.*.* (..))")
    public void doAccessCheck() {
        System.out.println("在之前执行了");
    }

    @AfterReturning("execution(* top.singi.aop.*.* (..))")
    public void doAfterReturningCheck() {
        System.out.println("在之后执行了");
    }

    @After("execution(* top.singi.aop.*.* (..))")
    public void doAfterCheck() {
        System.out.println("在最后执行了");
    }
}
