package com.thesised.fsy.user.service.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.thesised.fsy.user.dao.IUserInfoDao;
import com.thesised.fsy.user.domain.UserInfo;
import com.thesised.fsy.user.service.IUserInfoService;

@Service(IUserInfoService.SERVICE_NAME)
@Transactional(readOnly = true)
public class UserInfoServiceImpl implements IUserInfoService {

	@Resource(name = IUserInfoDao.SERVICE_NAME)
	IUserInfoDao userInfoDao;

	/**
	 * 保存测试表
	 */
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, readOnly = false)
	public void saveUserInfo(UserInfo userinfo) {
		userInfoDao.save(userinfo);
	}

	
	/**
	 * 指定查询条件的查询
	 */
	public List<UserInfo> findListByCondition(UserInfo user) {

		// 查询条件 一般由service层组织
		String condition = "";

		List<Object> paramsList = new ArrayList<Object>();
		// user.getFsyUser()!=null&&user.getFsyUser().equals("")
		if (StringUtils.isNotBlank(user.getFsyUser())) { // 判断非空和""；
			condition += " and t1.fsyUser like ?";

			paramsList.add("%" + user.getFsyUser() + "%");
			// user.getFsyAlterTime()

		}
		// list变成集合，一些框架都是这样
		Object[] params = paramsList.toArray();

		// 查询结果进行排序
		Map<String, String> orderBy = new LinkedHashMap<String, String>();

		orderBy.put(" t1.fsyAlterTime", "asc");

		List<UserInfo> list = userInfoDao.findListByCondition(condition,
				params, orderBy);

		return list;
	}

	/**
	 * 登录验证
	 */
	public UserInfo findUserByLogin(String fsyUser, String fsyPassword) {
		// 查询条件 一般由service层组织
		String condition = "";

		List<Object> paramsList = new ArrayList<Object>();
		// user.getFsyUser()!=null&&user.getFsyUser().equals("")
		if (StringUtils.isNotBlank(fsyUser)) { // 判断非空和""；
			condition += " and t1.fsyUser = ? and t1.fsyPassword = ? ";

			paramsList.add(fsyUser);
			paramsList.add(fsyPassword);
			// user.getFsyAlterTime()

		}
		// list变成集合，一些框架都是这样
		Object[] params = paramsList.toArray();
		
		Map<String, String> orderBy = new LinkedHashMap<String, String>();

		orderBy.put(" t1.fsyAlterTime", "asc");
		List<UserInfo> list = userInfoDao.findListByCondition(condition,
				params, orderBy);
		if (list.size() > 0)
			return list.get(0);
		else
			return null;
	}

}
