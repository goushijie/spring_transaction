package com.spring.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.declarexml.AccountService;

/**
 * Spring的基于AspectJ的XML配置声明式事务的测试类。
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContextDeclareXml.xml")
public class TestSpringDeclareXml {
	
	/**
	 * 注入代理类
	 */
	@Resource(name="accountService")
	private AccountService accountService;
		
	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}

	@Test
	/**
	 * 转账案例
	 */
	public void Test(){
		accountService.transfer("aaa", "bbb", 200d);
	}
}
