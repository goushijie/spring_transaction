package com.spring.declarexml;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.spring.declarexml.AccountDao;
/**
 *ת�˰�����DAO���ʵ���ࡣ
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao{
	/**
	 * @param strOut  :ת���˺�
	 * @param dbMoney :ת�˽��
	 */
	@Override
	public void outMoney(String strOut, Double dbMoney) {
		String strSql = "update account set money = money - ? where name = ?";
		this.getJdbcTemplate().update(strSql,dbMoney,strOut);
		
	}
	/**
	 * @param strIn   :ת���˺�
	 * @param dbMoney :ת����
	 */
	@Override
	public void inMoney(String strIn, Double dbMoney) {
		String strSql = "update account set money = money + ? where name = ?";
		this.getJdbcTemplate().update(strSql, dbMoney,strIn);
	}

}
