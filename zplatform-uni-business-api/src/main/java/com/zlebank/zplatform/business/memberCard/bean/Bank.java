package com.zlebank.zplatform.business.memberCard.bean;

import java.io.Serializable;

/**
 * bank bean
 * @author yangying
 *
 */
public class Bank implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5543233480246907369L;
	/**银行代码*/
	private String bankCode;
	/**银行名称*/
	private String bankName;
	/**银行图标**/
	private String bankIcon;
	
	

	public String getBankIcon() {
		return bankIcon;
	}

	public void setBankIcon(String bankIcon) {
		this.bankIcon = bankIcon;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
}
