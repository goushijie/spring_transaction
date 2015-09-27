package com.spring.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.programme.AccountService;

/** 
 * 转账案例的测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContextProgramme.xml")
public class TestSpingProgramme {

	//测试业务层类
	@Resource(name="accountService")
	private AccountService accountService;
	@Test
	public void Test(){
		accountService.transfer("aaa", "bbb", 200d);
	}
}
