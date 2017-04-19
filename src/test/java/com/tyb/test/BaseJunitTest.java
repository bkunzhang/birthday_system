package com.tyb.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
/**
 * 测试用例基类
 * @author 北辰不落雪
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mvc.xml", "classpath:spring-mybatis.xml"})
@Transactional
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true) 
public abstract class BaseJunitTest extends AbstractTransactionalJUnit4SpringContextTests {
	
}
