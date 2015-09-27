package com.spring.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.declareaop.AccountService;
/**
 * Spring的声明式的事务管理一的测试类。
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContextDeclareAop.xml")
public class TestSpringDeclareAop {
	
	/**
	 * 注入代理类：因为代理类已经进行了增强的操作。
	 */
	@Resource(name="accountServiceProxy")
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
