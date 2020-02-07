package kr.co.ch05.sub1;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Repository;

@Aspect
@Repository
public class LogAdvice {
	
	@Pointcut("execution(* kr.co.ch05.sub1.BoardService.insert*(..))")
	public void insertPointcut() {}	// 내용이 없는 참조메소드
	
	@Pointcut("execution(* kr.co.ch05.sub1.BoardService.select*(..))")
	public void seletcPointcut() {}
	
	@Pointcut("execution(* kr.co.ch05.sub1.BoardService.update*(..))")
	public void updatePointcut() {}
	
	@Pointcut("execution(* kr.co.ch05.sub1.BoardService.delete*(..))")
	public void deletePointcut() {}
	
	
	
	@Before("insertPointcut()")
	public void beforeAdvice() {
		System.out.println("횡단관심 beforeAdvice???");
	}

	@After("seletcPointcut()") 
	public void afterAdvice() {
		System.out.println("횡단관심 afterAdvice!!!");
	}
	
}
