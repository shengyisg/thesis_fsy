package com.thesised.fsy.user.model;

import com.thesised.fsy.base.model.BaseVo;

public class UserInfoVo extends BaseVo {
	/**
	 * �û���¼�˺�
	 */
	private String fsyUser;
	/**
	 * ��¼�˺�
	 * @return
	 */
	public String getFsyUser() {
		return fsyUser;
	}
	/**
	 * ��¼�˺�
	 * @param fsyUser
	 */
	public void setFsyUser(String fsyUser) {
		this.fsyUser = fsyUser;
	}
	
	/**
	 * ��¼����
	 */
	private String fsyPassword;
	
	/**
	 * ��¼����
	 * @return
	 */
	public String getFsyPassword() {
		return fsyPassword;
	}
	
	/**
	 * ��¼����
	 * @param fsyPassword
	 */
	public void setFsyPassword(String fsyPassword) {
		this.fsyPassword = fsyPassword;
	}
}
