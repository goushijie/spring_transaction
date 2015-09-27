package com.spring.declarexml;
/**
 * ת�˰�����ҵ���ʵ���ࡣ
 */
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.spring.declarexml.AccountDao;
import com.spring.declarexml.AccountService;

public class AccountServiceImpl implements AccountService {
	// ע��ת�˵�DAO����
	private AccountDao accountDao;
	
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	/** 
	 * @param strOut  :ת���˺�
	 * @param strIn   :ת���˺�
	 * @param dbMoney :ת�˽��
	 */
	@Override
	public void transfer(String strOut, String strIn, Double dbMoney) {
		accountDao.outMoney(strOut, dbMoney);
		int i = 1 / 0;
		accountDao.inMoney(strIn, dbMoney);
	}

}
