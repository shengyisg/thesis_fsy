package com.thesised.fsy.user.service;

import java.util.List;

import com.thesised.fsy.user.domain.UserInfo;
import com.thesised.fsy.user.model.UserInfoVo;

public interface IUserInfoService {
	public static String SERVICE_NAME="com.thesised.fsy.user.service.impl.UserInfoServiceImpl";
	void saveUserInfo(UserInfo userinfo);
	List<UserInfo> findListByCondition(UserInfo user);
	
	/**
	 * —È÷§µ«¬ºµƒ’À∫≈√‹¬Î
	 * @param fsyUser
	 * @param fsyPassword
	 * @return
	 */
	UserInfo findUserByLogin(String fsyUser, String fsyPassword);
	
	
	
}
