package com.spring.programme;
/**
 *ת�˰�����DAO��Ľӿڡ�
 */
public interface AccountDao {
	/**
	 * @param strOut  :ת���˺�
	 * @param dbMoney :ת�˽��
	 */
	public void outMoney(String strOut, Double dbMoney);
	/**
	 * @param strIn   :ת���˺�
	 * @param dbMoney :ת����
	 */
	public void inMoney(String strIn, Double dbMoney);
}
