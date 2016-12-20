package com.tyb.test;

import javax.annotation.Resource;

import org.junit.Test;

import com.tyb.birthdaySystem.bean.User;
import com.tyb.birthdaySystem.service.IUserService;

public class JuntTest extends BaseJunitTest{
	
	@Resource
	private IUserService userService;

	/*@Before
	public void before() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "classpath:spring-mvc.xml",
						"classpath:spring-mybatis.xml" });
		userService = (IUserService) context.getBean("userService");
	}*/

	@Test
	public void testUser() {
		String id = "1";
		User user =  userService.getUserById("1");
		System.out.println("**************"+user.getUId());
	}
}
