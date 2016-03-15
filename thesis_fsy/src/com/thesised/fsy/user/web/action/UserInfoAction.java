package com.thesised.fsy.user.web.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.thesised.fsy.base.action.BaseAction;
import com.thesised.fsy.user.domain.UserInfo;
import com.thesised.fsy.user.service.IUserInfoService;

@SuppressWarnings("serial")
@Controller("userInfoAction")
@Scope(value="prototype")
public class UserInfoAction extends BaseAction<UserInfo> {
	
	UserInfo userinfo=this.getModel();
	
	/**
	 *×¢Èëservice 
	 */
	@Resource(name=IUserInfoService.SERVICE_NAME)
	IUserInfoService userInfoService;
	
	
	
	public String save(){
 		userInfoService.saveUserInfo(userinfo);
 		String name=request.getParameter("fsyName");
 		System.out.println(name);
		return "save";
	}

	public String passwordAjax(){
		return null;
	}
	
}	
