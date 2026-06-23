package com.example.paymentaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PaymentAOP {

    @Before("execution(* com.example.paymentaop.service.Payment.payment(..))")
    public void beforePayment() {
        System.out.println("Before Advice : Security Check");
    }

    @After("execution(* com.example.paymentaop.service.Payment.validateCC(..))")
    public void afterValidateCC() {
        System.out.println("After Advice : Validation Completed");
    }

    @Around("execution(* com.example.paymentaop.service.Payment.process(..))")
    public Object aroundProcess(ProceedingJoinPoint pjp) throws Throwable {

        System.out.println("Around Advice Before");

        Object result = pjp.proceed();

        System.out.println("Around Advice After");

        System.out.println("Returned Value : " + result);

        return result;
    }
}