package kr.co.ch06;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * 날짜 : 2020-01-13
 * 이름 : 이지영
 * 내용 : Spring JDBC Select 실습하기
 */


public class JDBCSelectTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		
		UserDAO dao = (UserDAO) ctx.getBean("userDAO");
		
		UserVO user = dao.selectUser("2");
		
		System.out.println("아이디: " + user.getCustid());
		System.out.println("이  름: " + user.getName());
		System.out.println("주  소: " + user.getAddress());
		System.out.println("휴대폰: " + user.getPhone());

		List<UserVO> users = dao.selectUsers();
		
		for(UserVO vo : users) {
			System.out.println("======== user ========");
			System.out.println("아이디: " + vo.getCustid());
			System.out.println("이  름: " + vo.getName());
			System.out.println("주  소: " + vo.getAddress());
			System.out.println("휴대폰: " + vo.getPhone());
		}

		
		List<BookVO> book = dao.selectBooks();
		
		for(BookVO vo : book) {
			System.out.println("======== books ========");
			System.out.println("아이디: " + vo.getBookid());
			System.out.println("이  름: " + vo.getBookname());
			System.out.println("출판사: " + vo.getPublisher());
			System.out.println("가  격: " + vo.getPrice());
		}
		
		
		List<Map<String , Object>> books = dao.selectBooksMap();
		
		for(Map<String, Object> map : books) {
			System.out.println("======== map books ========");
			System.out.println("아이디: " + map.get("bookid"));
			System.out.println("이  름: " + map.get("bookname"));
			System.out.println("출판사: " + map.get("publisher"));
			System.out.println("가  격: " + map.get("price"));
			
		}
		
		
		
		
	}
} 
