package com.spring.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.programme.AccountService;

/** 
 * ת�˰����Ĳ�����
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContextProgramme.xml")
public class TestSpingProgramme {

	//����ҵ�����
	@Resource(name="accountService")
	private AccountService accountService;
	@Test
	public void Test(){
		accountService.transfer("aaa", "bbb", 200d);
	}
}
