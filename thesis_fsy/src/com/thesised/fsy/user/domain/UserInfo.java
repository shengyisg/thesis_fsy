package com.thesised.fsy.user.domain;

import java.util.Date;

public class UserInfo implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3050921335955700741L;
	
	/**
	 * 用户的主键id
	 */
	protected String fsyId;
	
	/**
	 * 用户id
	 * @return
	 */
	public String getFsyId() {
		return fsyId;
	}
	/**
	 * 用户ID
	 * @param fsyId
	 */
	public void setFsyId(String fsyId) {
		this.fsyId = fsyId;
	}
	
	/**
	 * 用户登录账号
	 */
	protected String fsyUser;
	/**
	 * 登录账号
	 * @return
	 */
	public String getFsyUser() {
		return fsyUser;
	}
	/**
	 * 登录账号
	 * @param fsyUser
	 */
	public void setFsyUser(String fsyUser) {
		this.fsyUser = fsyUser;
	}
	
	/**
	 * 用户name
	 */
	protected String fsyName;
	
	/**
	 * 用户name
	 * @return
	 */
	public String getFsyName() {
		return fsyName;
	}
	/**
	 *用户name
	 * @param fsyName
	 */
	public void setFsyName(String fsyName) {
		this.fsyName = fsyName;
	}
	
	/**
	 * 登录密码
	 */
	protected String fsyPassword;
	
	/**
	 * 登录密码
	 * @return
	 */
	public String getFsyPassword() {
		return fsyPassword;
	}
	
	/**
	 * 登录密码
	 * @param fsyPassword
	 */
	public void setFsyPassword(String fsyPassword) {
		this.fsyPassword = fsyPassword;
	}
	/**
	 * 年级
	 */
	protected String fsyGrade;
	
	/**
	 * 年级
	 * @return 年级
	 */
	public String getFsyGrade() {
		return fsyGrade;
	}
	/**
	 * 年级
	 * @param fsyGrade
	 */
	public void setFsyGrade(String fsyGrade) {
		this.fsyGrade = fsyGrade;
	}

	/**
	 * 所属部门
	 */
	protected String fsyDepartment;
	
	/**
	 * 所属部门
	 * @return
	 */
	public String getFsyDepartment() {
		return fsyDepartment;
	}
	/**
	 * 所属部门
	 * @param fsyDepartment
	 */
	public void setFsyDepartment(String fsyDepartment) {
		this.fsyDepartment = fsyDepartment;
	}
	
	/**
	 * 确定所属部门的真实性 
	 */
	protected Integer fsyDepartmentStatus;
	
	/**
	 * 确定所属部门的真实性
	 * @return
	 */
	public Integer getFsyDepartmentStatus() {
		return fsyDepartmentStatus;
	}
	/**
	 * 确定所属部门的真实性
	 * @param fsyDepartmentStatus
	 */
	public void setFsyDepartmentStatus(Integer fsyDepartmentStatus) {
		this.fsyDepartmentStatus = fsyDepartmentStatus;
	}
	
	/**
	 * 部门职务
	 */
	protected String fsyPost;
	
	/**
	 * 部门职务
	 * @return
	 */
	public String getFsyPost() {
		return fsyPost;
	}
	/**
	 * 部门职务
	 * @param fsyPost
	 */
	public void setFsyPost(String fsyPost) {
		this.fsyPost = fsyPost;
	}
	
	/**
	 * 权限
	 */
	protected Integer fsyPermission;
	
	/**
	 * 
	 * @return 权限
	 */
	public Integer getFsyPermission() {
		return fsyPermission;
	}
	/**
	 * 权限
	 * @param fsyPermission
	 */
	public void setFsyPermission(Integer fsyPermission) {
		this.fsyPermission = fsyPermission;
	}

	/**
	 * 更新时间
	 */
	protected Date fsyAlterTime;
	
	/**
	 * 更新时间
	 * @return
	 */
	public Date getFsyAlterTime() {
		return fsyAlterTime;
	}
	
	/**
	 * 更新时间
	 * @param fsyAlterTime
	 */
	public void setFsyAlterTime(Date fsyAlterTime) {
		this.fsyAlterTime = fsyAlterTime;
	}
	
	
}
