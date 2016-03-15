package com.thesised.fsy.user.domain;

import java.util.Date;

public class UserInfo implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3050921335955700741L;
	
	/**
	 * �û�������id
	 */
	protected String fsyId;
	
	/**
	 * �û�id
	 * @return
	 */
	public String getFsyId() {
		return fsyId;
	}
	/**
	 * �û�ID
	 * @param fsyId
	 */
	public void setFsyId(String fsyId) {
		this.fsyId = fsyId;
	}
	
	/**
	 * �û���¼�˺�
	 */
	protected String fsyUser;
	/**
	 * ��¼�˺�
	 * @return
	 */
	public String getFsyUser() {
		return fsyUser;
	}
	/**
	 * ��¼�˺�
	 * @param fsyUser
	 */
	public void setFsyUser(String fsyUser) {
		this.fsyUser = fsyUser;
	}
	
	/**
	 * �û�name
	 */
	protected String fsyName;
	
	/**
	 * �û�name
	 * @return
	 */
	public String getFsyName() {
		return fsyName;
	}
	/**
	 *�û�name
	 * @param fsyName
	 */
	public void setFsyName(String fsyName) {
		this.fsyName = fsyName;
	}
	
	/**
	 * ��¼����
	 */
	protected String fsyPassword;
	
	/**
	 * ��¼����
	 * @return
	 */
	public String getFsyPassword() {
		return fsyPassword;
	}
	
	/**
	 * ��¼����
	 * @param fsyPassword
	 */
	public void setFsyPassword(String fsyPassword) {
		this.fsyPassword = fsyPassword;
	}
	/**
	 * �꼶
	 */
	protected String fsyGrade;
	
	/**
	 * �꼶
	 * @return �꼶
	 */
	public String getFsyGrade() {
		return fsyGrade;
	}
	/**
	 * �꼶
	 * @param fsyGrade
	 */
	public void setFsyGrade(String fsyGrade) {
		this.fsyGrade = fsyGrade;
	}

	/**
	 * ��������
	 */
	protected String fsyDepartment;
	
	/**
	 * ��������
	 * @return
	 */
	public String getFsyDepartment() {
		return fsyDepartment;
	}
	/**
	 * ��������
	 * @param fsyDepartment
	 */
	public void setFsyDepartment(String fsyDepartment) {
		this.fsyDepartment = fsyDepartment;
	}
	
	/**
	 * ȷ���������ŵ���ʵ�� 
	 */
	protected Integer fsyDepartmentStatus;
	
	/**
	 * ȷ���������ŵ���ʵ��
	 * @return
	 */
	public Integer getFsyDepartmentStatus() {
		return fsyDepartmentStatus;
	}
	/**
	 * ȷ���������ŵ���ʵ��
	 * @param fsyDepartmentStatus
	 */
	public void setFsyDepartmentStatus(Integer fsyDepartmentStatus) {
		this.fsyDepartmentStatus = fsyDepartmentStatus;
	}
	
	/**
	 * ����ְ��
	 */
	protected String fsyPost;
	
	/**
	 * ����ְ��
	 * @return
	 */
	public String getFsyPost() {
		return fsyPost;
	}
	/**
	 * ����ְ��
	 * @param fsyPost
	 */
	public void setFsyPost(String fsyPost) {
		this.fsyPost = fsyPost;
	}
	
	/**
	 * Ȩ��
	 */
	protected Integer fsyPermission;
	
	/**
	 * 
	 * @return Ȩ��
	 */
	public Integer getFsyPermission() {
		return fsyPermission;
	}
	/**
	 * Ȩ��
	 * @param fsyPermission
	 */
	public void setFsyPermission(Integer fsyPermission) {
		this.fsyPermission = fsyPermission;
	}

	/**
	 * ����ʱ��
	 */
	protected Date fsyAlterTime;
	
	/**
	 * ����ʱ��
	 * @return
	 */
	public Date getFsyAlterTime() {
		return fsyAlterTime;
	}
	
	/**
	 * ����ʱ��
	 * @param fsyAlterTime
	 */
	public void setFsyAlterTime(Date fsyAlterTime) {
		this.fsyAlterTime = fsyAlterTime;
	}
	
	
}
