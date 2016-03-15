package com.thesised.fsy.base.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.ParameterizedType;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.alibaba.fastjson.JSON;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.thesised.fsy.utils.TUtil;

public class BaseAction<T> extends ActionSupport implements ModelDriven<T>,ServletRequestAware,ServletResponseAware {
	
	T entity;
	
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	/**
	 * 利用反射，通过构造方法将泛型T 实例化
	 */
	public BaseAction(){
		
		Class entityClass = TUtil.getActualType(this.getClass());
		
		try {
			entity= (T)entityClass.newInstance();
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
	}
	
	//每一个Action
	public T getModel() {
		return entity;
	}

	@Override
	public void setServletResponse(HttpServletResponse res) {
		this.response=res;
		
	}

	@Override
	public void setServletRequest(HttpServletRequest req) {
		this.request=req;
		
	}
	
	
	protected void OutputJson(JSON object, HttpServletResponse httpServletResponse) {
		PrintWriter out = null;
		httpServletResponse.setContentType("application/json");
		httpServletResponse.setCharacterEncoding("utf-8");
		try {
			out = httpServletResponse.getWriter();
			if (object == null) {
				out.print("null");
			} else {
				out.print(object.toJSONString());
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			if (out != null)
				out.close();
		}

		out.close();
	}

}
