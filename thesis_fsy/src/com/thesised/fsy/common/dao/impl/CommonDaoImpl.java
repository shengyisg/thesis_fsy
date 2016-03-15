package com.thesised.fsy.common.dao.impl;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.thesised.fsy.common.dao.ICommonDao;
import com.thesised.fsy.utils.TUtil;

public class CommonDaoImpl<T> extends HibernateDaoSupport implements ICommonDao<T> {

	/*泛型转化*/
	Class entityClass =TUtil.getActualType(this.getClass());
	
	
	@Resource(name="sessionFactory")
	public void setDi(SessionFactory sessionFactory){
		this.setSessionFactory(sessionFactory);
	}

	/**
	 * 公共保存
	 */
	public void save(T entity) {
		this.getHibernateTemplate().save(entity);
	}

	/**
	 * 更新用户
	 */
	public void update(T entity) {
		this.getHibernateTemplate().update(entity);
	}

	@Override
	public T findByUserId(Serializable id) { 
	
		return (T)this.getHibernateTemplate().get(entityClass, id);
		
	}

	@Override
	public void deleteObjectByIds(Serializable... fsyIds) {
		if(fsyIds!=null&&fsyIds.length>0){
			for(Serializable id:fsyIds){
				//都是先查询出来再删除整个记录
				Object entity =this.findByUserId(id);
				this.getHibernateTemplate().delete(entity);
			}
		}
		
	}
	
	/**
	 * 删除专有对象的list
	 */
	public void deleteObjectByCollention(List<T> list) {
		this.getHibernateTemplate().deleteAll(list);
	}

	public List<T> findListByCondition(String condition, final Object[] params,
			Map<String, String> orderBy) {
		//根据参数组织hql语句
		
		String hql="from "+entityClass.getSimpleName()+" t1 where 1=1";
		
		//将排序的MAP变成语句
		String orderByMap=setOrderBy(orderBy);
		
		//最终的查询语句
		final String finalHQL=hql+condition+orderByMap;
		
		//运行hql语句方法1
		//方法1，使用模板
		List<T> list1=this.getHibernateTemplate().find(finalHQL, params);
		//方法2
//		SessionFactory sf=this.getHibernateTemplate().getSessionFactory();
//		Session s=sf.getCurrentSession();//  session与线程绑定
//		
//		Query query=s.createQuery(finalHQL);
//		if(params!=null&&params.length>0){
//			for (int i = 0; i < params.length; i++) {
//				query.setParameter(i,params[i]);
//			}
//		}
//		List<T> list2=query.list();
//		//方案三
//		List<T> list3=this.getHibernateTemplate().execute(new HibernateCallback () {
//
//			@Override
//			public Object doInHibernate(Session session) throws HibernateException,
//					SQLException {
//				Query query=session.createQuery(finalHQL);
//				if(params!=null&&params.length>0){
//					for (int i = 0; i < params.length; i++) {
//						query.setParameter(i,params[i]);
//					}
//				}
//				return query.list();
//			}
//		});
//		
		return list1;
	}
	
	private String setOrderBy(Map<String, String> orderBy){
		StringBuffer order =new StringBuffer("");
		if(orderBy!=null&&orderBy.size()>0){
			order.append(" Order By ");
			for(Map.Entry<String, String> map:orderBy.entrySet()){
				order.append(map.getKey()+" "+map.getValue()+",");
			}
			//去掉最后一个逗号
			order.deleteCharAt(order.length()-1);
		}
		
		return order.toString();
	}
}
