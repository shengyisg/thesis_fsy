package com.thesised.fsy.common.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.thesised.fsy.user.domain.UserInfo;

public interface ICommonDao<T> {
	
	/**
	 * 添加用户
	 * @param entity
	 */
	void save(T entity);
	
	/**
	 * 更新用户
	 * @param entity
	 */
	void update(T entity);
	
	/**
	 * 根据用户Id查询用户
	 * @param fsyId
	 * @return
	 */
	T  findByUserId(Serializable fsyId);
	
	/**
	 * 可变参数删除ID用户
	 * @param fsyIds
	 */
	void deleteObjectByIds(Serializable... fsyIds);
	
	void deleteObjectByCollention(List<T> list);
	
	List<T> findListByCondition(String condition, Object[] params,
			Map<String, String> orderBy);
}
