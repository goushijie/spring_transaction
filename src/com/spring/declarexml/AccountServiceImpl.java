package com.spring.declarexml;
/**
 * 转账案例的业务层实现类。
 */
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.spring.declarexml.AccountDao;
import com.spring.declarexml.AccountService;

public class AccountServiceImpl implements AccountService {
	// 注入转账的DAO的类
	private AccountDao accountDao;
	
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	/** 
	 * @param strOut  :转出账号
	 * @param strIn   :转入账号
	 * @param dbMoney :转账金额
	 */
	@Override
	public void transfer(String strOut, String strIn, Double dbMoney) {
		accountDao.outMoney(strOut, dbMoney);
		int i = 1 / 0;
		accountDao.inMoney(strIn, dbMoney);
	}

}
