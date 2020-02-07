package kr.co.ch06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * 날짜 : 2020-01-13
 * 이름 : 이지영
 * 내용 : Spring JDBC 실습하기
 */

public class JDBCTest {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		
		UserDAO dao = (UserDAO) ctx.getBean("userDAO");
		
//		dao.insertUser();
//		System.out.println("insert 완료");
		
//		dao.updateUser();
//		System.out.println("update 완료");
		
//		dao.deleteUser();
//		System.out.println("delete 완료");
		
	}

}
