package com.spring.declarexml;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.spring.declarexml.AccountDao;
/**
 *转账案例的DAO层的实现类。
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao{
	/**
	 * @param strOut  :转出账号
	 * @param dbMoney :转账金额
	 */
	@Override
	public void outMoney(String strOut, Double dbMoney) {
		String strSql = "update account set money = money - ? where name = ?";
		this.getJdbcTemplate().update(strSql,dbMoney,strOut);
		
	}
	/**
	 * @param strIn   :转入账号
	 * @param dbMoney :转入金额
	 */
	@Override
	public void inMoney(String strIn, Double dbMoney) {
		String strSql = "update account set money = money + ? where name = ?";
		this.getJdbcTemplate().update(strSql, dbMoney,strIn);
	}

}
