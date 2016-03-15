package com.thesised.fsy.common.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.thesised.fsy.user.domain.UserInfo;

public interface ICommonDao<T> {
	
	/**
	 * ����û�
	 * @param entity
	 */
	void save(T entity);
	
	/**
	 * �����û�
	 * @param entity
	 */
	void update(T entity);
	
	/**
	 * �����û�Id��ѯ�û�
	 * @param fsyId
	 * @return
	 */
	T  findByUserId(Serializable fsyId);
	
	/**
	 * �ɱ����ɾ��ID�û�
	 * @param fsyIds
	 */
	void deleteObjectByIds(Serializable... fsyIds);
	
	void deleteObjectByCollention(List<T> list);
	
	List<T> findListByCondition(String condition, Object[] params,
			Map<String, String> orderBy);
}
