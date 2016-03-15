<%@page import="java.net.URLEncoder"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<style type="text/css">
<!--
fieldset div {
	float: left;
	width: 24%;
	text-align: left;
	line-height: 25px;
}

td div {
	float: left;
	width: 24%;
	text-align: left;
	line-height: 25px;
}
-->
</style>
<HTML>
<HEAD>
<title>角色权限管理</title>
<LINK href="${pageContext.request.contextPath }/css/Style.css"
	type="text/css" rel="stylesheet">
<script language="javascript"
	src="${pageContext.request.contextPath }/script/function.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/script/pub.js"></script>
<script language="javascript"
	src="${pageContext.request.contextPath }/script/jquery-1.4.2.js"></script>
</HEAD>

<body>
	<Form name="Form1" id="Form1" method="post" style="margin:0px;">
		<table cellSpacing="1" cellPadding="0" width="90%" align="center"
			bgColor="#f5fafe" border="0">
			<TBODY>
				<tr>
					<td class="ta_01" colspan=2 align="center"
						background="${pageContext.request.contextPath }/images/b-info.gif">
						<font face="宋体" size="2"><strong>角色管理</strong></font>
					</td>
				</tr>
				<tr>
					<td class="ta_01" colspan=2 align="right" width="100%" height=10>
					</td>
				</tr>
				<tr>
					<td class="ta_01" align="right" width="35%">角色类型&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td class="ta_01" align="left" width="65%"><s:select
							list="#request.roleList" name="roleID" id="Form1_roleID"
							listKey="roleID" listValue="roleName" headerKey="0"
							headerValue="请选择" cssClass="bg" cssStyle="width:180px"
							onchange="selectRole()">
						</s:select></td>
				</tr>
				<tr>
					<td class="ta_01" align="right" colspan=2 align="right"
						width="100%" height=10></td>
				</tr>
			</TBODY>
		</table>
	</form>


	<form id="Form2" name="Form2"
		action="${pageContext.request.contextPath }/system/elecRoleAction_home.do"
		method="post" style="margin:0px;">

		<table cellSpacing="1" cellPadding="0" width="90%" align="center"
			bgColor="#f5fafe" border="0">
			<tr>
				<td>
					<fieldset
						style="width:100%; border : 1px solid #73C8F9;text-align:left;COLOR:#023726;FONT-SIZE: 12px;">
						<legend align="left">权限分配</legend>

						<table cellSpacing="0" cellPadding="0" width="90%" align="center"
							bgColor="#f5fafe" border="0">
							<tr>
								<td class="ta_01" colspan=2 align="left" width="100%">

									<table cellspacing="0" align="center" width="100%"
										cellpadding="1" rules="all" bordercolor="gray" border="1"
										style="BORDER-RIGHT:gray 1px solid; BORDER-TOP:gray 1px solid; BORDER-LEFT:gray 1px solid; WORD-BREAK:break-all; BORDER-BOTTOM:gray 1px solid; BORDER-COLLAPSE:collapse; BACKGROUND-COLOR:#f5fafe; WORD-WRAP:break-word">
										<s:if
											test="#request.popedomList!=null && #request.popedomList.size()>0">
											<s:iterator value="#request.popedomList">
												<tr onmouseover="this.style.backgroundColor = 'white'"
													onmouseout="this.style.backgroundColor = '#F5FAFE';">
													<td class="ta_01" align="left" width="18%" height="22"
														background="../images/tablehead.jpg"><input
														type="checkbox" name="selectoper"
														id="<s:property value="mid"/>_<s:property value="mid"/>"
														value="" onClick='goSelect(this.id)'> <s:property
															value="name" />：</td>
													<td class="ta_01" align="left" width="82%" height="22">
														<s:if test="list!=null && list.size()>0">
															<s:iterator value="list">
																<div>
																	<input type="checkbox" name="selectoper"
																		id="<s:property value="pid"/>_<s:property value="mid"/>"
																		value="" onClick='goSelect(this.id)'>
																	<s:property value="name" />
																</div>
															</s:iterator>
														</s:if>
													</td>
												</tr>
											</s:iterator>
										</s:if>
									</table>

								</td>
							</tr>
						</table>
					</fieldset>
				</td>
			</tr>
		</table>
	</Form>
</body>
</HTML>
