package kr.co.ch05.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BeforeAdvice {
	
	@Pointcut("execution (* kr.co.ch05.sub2.BoardService.insert*())")
	public void insertPointcut() {}
	
	@Pointcut("execution (* kr.co.ch05.sub2.BoardService.select*())")
	public void selectPointcut() {}
	
	@Before("insertPointcut() || selectPointcut()")
	public void before1() {
		System.out.println("횡단관심 - before1... ");
	}
	
	@Before("selectPointcut()")
	public void before2() {
		System.out.println("횡단관심 - before2...... ");
	}

	public void before3() {
		System.out.println("횡단관심 - before3......... ");
	}

}
