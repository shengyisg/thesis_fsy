package com.thesised.fsy.user.web.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.alibaba.fastjson.JSONObject;
import com.thesised.fsy.base.action.BaseAction;
import com.thesised.fsy.user.domain.UserInfo;
import com.thesised.fsy.user.model.UserInfoVo;
import com.thesised.fsy.user.service.IUserInfoService;
import com.thesised.fsy.utils.MD5Util;

@SuppressWarnings("serial")
@Controller("userLoginAction")
@Scope(value = "prototype")
public class UserLoginAction extends BaseAction<UserInfoVo> {

	UserInfoVo userinfoVo = this.getModel();

	/**
	 * 注入service
	 */

	@Resource(name = IUserInfoService.SERVICE_NAME)
	IUserInfoService userInfoService;

	/**
	 * 学生部门管理系统的入口
	 * 
	 * @return String 跳转到system/home.jsp
	 */
	public String login() {
//		UserInfo user = userInfoService.findUserByLogin(
//				userinfoVo.getFsyUser(), userinfoVo.getFsyPassword());
		
		String userName=request.getParameter("fsyUser");
		String userPassword=request.getParameter("fsyPassword");
		
		UserInfo user = userInfoService.findUserByLogin(
				userName, MD5Util.getMD5String(userPassword));
		
		JSONObject result = new JSONObject();
		
		if (user == null) {
			request.setAttribute("error", "账户或密码错误");
			result.put("result", "error");
		}else{
			result.put("result", "success");
			request.getSession().setAttribute("user",user);
		}
		OutputJson(result, response);
		return null;
		
	}
	
	public String goHome(){
		//跳转到首页
		return "home";
	}
	
	/**
	 * 退出系统 跳转到登录界面
	 * 
	 * @return
	 */
	public String logout() {
		// 清除系统的session；
		request.getSession().invalidate();
		return "logout";
	}
}
