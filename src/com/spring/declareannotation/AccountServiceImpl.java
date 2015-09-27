package com.spring.declareannotation;
/**
 * 转账案例的业务层实现类。
 */
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *Transactional注解的属性：
 *propagation ：事务的传播行为。
 *isolation   ：事务的隔离级别。
 *readOnly　　   ：只读。
 *rollbackFor ：发生哪些异常回滚。
 *norollbackFor：发生哪些异常不回滚。
 *（不写按默认值）
 */
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,readOnly = false)
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
