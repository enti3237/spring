package kr.co.ch04.sub2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


/*
 * 날짜 : 2020-01-08
 * 이름 : 이지영
 * 내용 : AOP Advice 동작시점 실습하기
 */

public class AdviceText {
	
	public static void	main(String[] args) {

		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		BoardService bs = (BoardService) ctx.getBean("bs2");
		
		System.out.println("===========================");
		bs.insert();
		
		System.out.println("===========================");
		bs.select();
		
		System.out.println("===========================");
		bs.update(1);

		System.out.println("===========================");
		try {
			bs.delete(1, null);
			
		} catch (Exception e) {
			System.out.println("예외 발생!");
		}
		System.out.println("===========================");

	}

}
