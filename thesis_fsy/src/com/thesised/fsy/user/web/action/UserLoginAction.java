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
	 * ע��service
	 */

	@Resource(name = IUserInfoService.SERVICE_NAME)
	IUserInfoService userInfoService;

	/**
	 * ѧ�����Ź���ϵͳ�����
	 * 
	 * @return String ��ת��system/home.jsp
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
			request.setAttribute("error", "�˻����������");
			result.put("result", "error");
		}else{
			result.put("result", "success");
			request.getSession().setAttribute("user",user);
		}
		OutputJson(result, response);
		return null;
		
	}
	
	public String goHome(){
		//��ת����ҳ
		return "home";
	}
	
	/**
	 * �˳�ϵͳ ��ת����¼����
	 * 
	 * @return
	 */
	public String logout() {
		// ���ϵͳ��session��
		request.getSession().invalidate();
		return "logout";
	}
}
