package com.spring.declarexml;
/**
 * 转账案例的业务层接口
 */
public interface AccountService {
	/** 
	 * @param strOut  :转出账号
	 * @param strIn   :转入账号
	 * @param dbMoney :转账金额
	 */
	public void transfer(String strOut,String strIn, Double dbMoney);

}
