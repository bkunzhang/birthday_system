package com.tyb.test;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;

import com.tyb.birthdaySystem.bean.User;
import com.tyb.birthdaySystem.dao.IInfoDao;
import com.tyb.birthdaySystem.service.IInfoService;
import com.tyb.birthdaySystem.service.IUserService;

public class JuntTest extends BaseJunitTest{
	
	@Resource
	private IUserService userService;
	@Resource
	private IInfoService infoService;
	@Resource
	private IInfoDao infoDao;

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
		System.err.println("**************"+user.getUId());
		
		Date date = new Date(2016,11,27);
		System.err.println(date);
		List<Map<String, Object>> datas = infoDao.getInfoByDate("2016-11-27");
		System.err.println(datas.size());
		for (Map<String, Object> data : datas) {
			System.err.print(data.get("u_email")+"/");
			System.err.println(data.get("info_name"));
		}
	}
}
