package kr.co.ch02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

//날짜 : 2020/01/01
//이름 : 이지영
//내용 : Ioc 실습하기

public class IocTest {
	
	public static void main(String[] args) {
		
		// Ioc 적용 안한 상태
		TV ltv = new LgTV();
		ltv.power();
		ltv.chUp();
		ltv.soundUp();
		
		TV stv = new SamsungTV();
		stv.power();
		stv.chUp();
		stv.soundUp();
		
		// Spring Ioc 적용하기
		
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		
		TV tv1 = (LgTV) ctx.getBean("ltv");
		TV tv2 = (SamsungTV) ctx.getBean("stv");
		
		tv1.power();
		tv1.chUp();
		tv1.soundUp();

		tv2.power();
		tv2.chUp();
		tv2.soundUp();

	}

}
