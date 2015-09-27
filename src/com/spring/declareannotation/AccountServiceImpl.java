package com.spring.declareannotation;
/**
 * ת�˰�����ҵ���ʵ���ࡣ
 */
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *Transactionalע������ԣ�
 *propagation ������Ĵ�����Ϊ��
 *isolation   ������ĸ��뼶��
 *readOnly����   ��ֻ����
 *rollbackFor ��������Щ�쳣�ع���
 *norollbackFor��������Щ�쳣���ع���
 *����д��Ĭ��ֵ��
 */
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,readOnly = false)
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
