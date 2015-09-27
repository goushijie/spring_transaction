package com.spring.programme;
/**
 * 转账案例的业务层实现类。
 */
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.spring.programme.AccountDao;
import com.spring.programme.AccountService;
import com.sun.istack.internal.FinalArrayList;

public class AccountServiceImpl implements AccountService {
	// 注入转账的DAO的类
	private AccountDao accountDao;
	
	//注入事务管理的模板
	private TransactionTemplate transactionTemplate;
	

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}
	
	/** 
	 * @param strOut  :转出账号
	 * @param strIn   :转入账号
	 * @param dbMoney :转账金额
	 */
	@Override
	public void transfer(final String strOut, final String strIn, final Double dbMoney) {
		transactionTemplate.execute(new TransactionCallbackWithoutResult() { //使用匿名内部类
			
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
				//匿名内部类，使用了外部的参数，则需将变量定义成final。
				accountDao.outMoney(strOut, dbMoney);
//				int i = 1 / 0;
				accountDao.inMoney(strIn, dbMoney);
			}
		});
	}

}
