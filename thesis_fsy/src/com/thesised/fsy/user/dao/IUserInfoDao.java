package com.thesised.fsy.user.dao;




import com.thesised.fsy.common.dao.ICommonDao;
import com.thesised.fsy.user.domain.UserInfo;

public interface IUserInfoDao extends ICommonDao<UserInfo>{
	public static final String SERVICE_NAME="com.thesised.fsy.user.dao.impl.UserInfoDaoImpl";

	
}
