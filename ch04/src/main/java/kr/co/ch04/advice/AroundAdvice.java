package kr.co.ch04.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class AroundAdvice {
	
	public void around1(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("횡단관심 - around1-before... ");
		pjp.proceed();
		System.out.println("횡단관심 - around1-after... ");
	}
	
	public void around2(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("횡단관심 - around2-before... ");
		pjp.proceed();
		System.out.println("횡단관심 - around2-after... ");
	}

	public void around3(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("횡단관심 - around3-before... ");
		pjp.proceed();
		System.out.println("횡단관심 - around3-after... ");
	}

}
