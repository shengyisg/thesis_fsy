package com.thesised.fsy.user.dao.impl;

import org.springframework.stereotype.Repository;

import antlr.collections.List;

import com.thesised.fsy.common.dao.impl.CommonDaoImpl;
import com.thesised.fsy.user.dao.IUserInfoDao;
import com.thesised.fsy.user.domain.UserInfo;

@Repository(IUserInfoDao.SERVICE_NAME)
public class UserInfoDaoImpl extends CommonDaoImpl<UserInfo> implements
		IUserInfoDao {

}
