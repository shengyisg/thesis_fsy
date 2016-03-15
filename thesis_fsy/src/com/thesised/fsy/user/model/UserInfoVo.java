package com.thesised.fsy.user.model;

import com.thesised.fsy.base.model.BaseVo;

public class UserInfoVo extends BaseVo {
	/**
	 * ÓÃ»§µÇÂ¼ÕËºÅ
	 */
	private String fsyUser;
	/**
	 * µÇÂ¼ÕËºÅ
	 * @return
	 */
	public String getFsyUser() {
		return fsyUser;
	}
	/**
	 * µÇÂ¼ÕËºÅ
	 * @param fsyUser
	 */
	public void setFsyUser(String fsyUser) {
		this.fsyUser = fsyUser;
	}
	
	/**
	 * µÇÂ¼ÃÜÂë
	 */
	private String fsyPassword;
	
	/**
	 * µÇÂ¼ÃÜÂë
	 * @return
	 */
	public String getFsyPassword() {
		return fsyPassword;
	}
	
	/**
	 * µÇÂ¼ÃÜÂë
	 * @param fsyPassword
	 */
	public void setFsyPassword(String fsyPassword) {
		this.fsyPassword = fsyPassword;
	}
}
