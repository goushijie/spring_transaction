package com.spring.declareaop;
/**
 * ת�˰�����ҵ���ӿ�
 */
public interface AccountService {
	/** 
	 * @param strOut  :ת���˺�
	 * @param strIn   :ת���˺�
	 * @param dbMoney :ת�˽��
	 */
	public void transfer(String strOut,String strIn, Double dbMoney);

}
