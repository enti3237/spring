package ml.enti3237.dmall;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ml.enti3237.dmall.admin.dao.AdminGoodsDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-context-test.xml"})
public class AdminTest {
	
	@Inject
	private AdminGoodsDAO dao;

	@Test
	public void test() {
		
	}
}
