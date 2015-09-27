package com.spring.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.declareaop.AccountService;
/**
 * Spring������ʽ���������һ�Ĳ����ࡣ
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContextDeclareAop.xml")
public class TestSpringDeclareAop {
	
	/**
	 * ע������ࣺ��Ϊ�������Ѿ���������ǿ�Ĳ�����
	 */
	@Resource(name="accountServiceProxy")
	private AccountService accountService;
		
	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}

	@Test
	/**
	 * ת�˰���
	 */
	public void Test(){
		accountService.transfer("aaa", "bbb", 200d);
	}
}
