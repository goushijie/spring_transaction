package com.spring.programme;
/**
 * ת�˰�����ҵ���ʵ���ࡣ
 */
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.spring.programme.AccountDao;
import com.spring.programme.AccountService;
import com.sun.istack.internal.FinalArrayList;

public class AccountServiceImpl implements AccountService {
	// ע��ת�˵�DAO����
	private AccountDao accountDao;
	
	//ע����������ģ��
	private TransactionTemplate transactionTemplate;
	

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}
	
	/** 
	 * @param strOut  :ת���˺�
	 * @param strIn   :ת���˺�
	 * @param dbMoney :ת�˽��
	 */
	@Override
	public void transfer(final String strOut, final String strIn, final Double dbMoney) {
		transactionTemplate.execute(new TransactionCallbackWithoutResult() { //ʹ�������ڲ���
			
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
				//�����ڲ��࣬ʹ�����ⲿ�Ĳ��������轫���������final��
				accountDao.outMoney(strOut, dbMoney);
//				int i = 1 / 0;
				accountDao.inMoney(strIn, dbMoney);
			}
		});
	}

}
