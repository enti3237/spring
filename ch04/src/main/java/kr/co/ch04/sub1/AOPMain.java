package kr.co.ch04.sub1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * 날짜 : 2020-01-08
 * 이름 : 이지영
 * 내용 : AOP 실습
 * 
 * Spring AOP 
 * 	- 핵심관심과 전체에 적용되는 공통관심(횡단관심)을 분리해서 프로그래밍하는 방식
 * 
 * 주요용어
 * 	1) Join Point : 실행하는 모든 핵심관심 메서드 (insert, select...)
 * 	2) Point Cut : 조인포인트 중에서 실행(AOP가 설정)되는 메서드 (insert)
 * 	3) Advice : 횡단관심에 해당하는 공통의 부가기능 메서드 (beforeLog)
 * 	4) Aspect : 포인트컷과 어드바이스의 결합 (aop:aspect)
 * 	5) Weaving : 포인트컷이 실행될 때 어드바이스가 포인트컷에 결합되는 과정
 * 
 * 포인트컷 표현식
 * 	- execution(리턴타입 패키지명.클래스명.메서드명(매개변수))
 * 
 *	1) 리턴타입
 *		- * 	: 모든 리턴 타입 허용
 *		- void  : 리턴타입이 void인 메서드
 *		- !void : 리턴타입이 void가 아닌 메서드
 *
 *	2) 패키지명
 *		- kr.co.ch04.         : 해당패키지 대상 
 *		- kr.co.ch04.. 	      : kr.co.ch04로 시작하는 모든 패키지
 *		- kr.co.ch04..service : kr.co.ch04로 시작해서 마지막 패키지명이 service로 끝나는 패키지(java 파일 아님!)
 *
 *	3) 클래스명
 *		- BoardService : 해당 클래스 대상
 *		- *Service : 클래스명이 Service로 끝나는 클래스 대상
 *
 *	4) 메소드명
 *		- *(..)   : 모든 메소드 (매개변수 제한 없음)
 *		- *(*)    : 매개변수를 1개 갖는 모든 메소드
 *		- *(*, *) : 매개변수를 2개 갖는 모든 메소드
 *		- get*()  : get으로 시작하는 모든 메소드 (매개변수 제한 없음)
 * 
 */

public class AOPMain {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		BoardService bs = (BoardService) ctx.getBean("bs1");
		
		bs.insert();
		bs.select();
		bs.update(1);
		bs.delete(1, "a");
		
	}

}
