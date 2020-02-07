package kr.co.ch05.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AroundAdvice {
	
	@Pointcut("execution (* kr.co.ch05.sub2.BoardService.insert*(..))")
	public void insertPointcut() {}
	

	@Pointcut("execution (* kr.co.ch05.sub2.BoardService.select*())")
	public void selectPointcut() {}
	
	@Pointcut("execution (* kr.co.ch05.sub2.BoardService.update*(..))")
	public void updatePointcut() {}
	
	@Around("insertPointcut() || selectPointcut()")
	public void around1(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("횡단관심 - around1-before... ");
		pjp.proceed();	// 핵심관심 실행
		System.out.println("횡단관심 - around1-after... ");
	}
	
	public void around2(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("횡단관심 - around2-before... ");
		pjp.proceed();
		System.out.println("횡단관심 - around2-after... ");
	}

	@Around("updatePointcut()")
	public void around3(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("횡단관심 - around3-before... ");
		pjp.proceed();
		System.out.println("횡단관심 - around3-after... ");
	}

}
