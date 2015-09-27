package com.spring.programme;
/**
 *转账案例的DAO层的接口。
 */
public interface AccountDao {
	/**
	 * @param strOut  :转出账号
	 * @param dbMoney :转账金额
	 */
	public void outMoney(String strOut, Double dbMoney);
	/**
	 * @param strIn   :转入账号
	 * @param dbMoney :转入金额
	 */
	public void inMoney(String strIn, Double dbMoney);
}
