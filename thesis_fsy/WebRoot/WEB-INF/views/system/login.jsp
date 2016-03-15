<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path;
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
<title>无标题页</title>
<meta http-equiv=Content-Type content="text/html; charset=utf-8">
<link href="<%=basePath%>/resources/system/css/public.css" type=text/css
	rel=stylesheet>
<link href="<%=basePath%>/resources/system/css/login.css" type=text/css rel=stylesheet>
<style type=text/css>
</STYLE>
<meta content="MSHTML 6.00.2900.5848" name=GENERATOR>
<script type="text/javascript"
	src="<%=basePath%>/resources/js/jquery.js"></script>
</head>
<body>
	<h1 align="center">
		<font size="9" color="white"><b></b></font>
	</h1>
	<div class="loginPanel">
		<form id="loginForm" action="/user/userLoginAction_login.do"
			class="form-horizontal">



			<div class="login-groupp">
				<label class="login-label"><span class="red">*</span><font
					color="white">学号：</font><input id="fsyUser" type="text"
					class="input-large" name="fsyUser" onfocus="Onfocus(fsyUser)" /><span id="fdLoginMess"></span> </label>

			</div>
			<div class="login-groupp">
				<label class="login-label"><span class="red">*</span><font
					color="white">密码：</font><input id="fsyPassword" type="password"
					class="input-large" name="fsyPassword"
					onfocus="Onfocus(fsyPassword)" /> </label>

			</div>
			<input type="button" value="登 录 " class="go" onclick="login()" />
		</form>
	</div>
</body>
<script type="text/javascript">
	function login(){
		var form_ = $('#loginForm');
		
		var fsyUser=$("input[name=fsyUser]").val();
		var fsyPassword=$("input[name=fsyPassword]").val();
		
		
		var flag=true;
	
		if (fsyUser==null || $.trim(fsyUser).length==0) {
			$('#fdLoginMess').empty().append("<span id='fdLoginMess'><font color='red'>您还没有输入学号！</font></span>");
			flag=false;
			return flag;
		}else if (fsyPassword==null || $.trim(fsyPassword).length==0) {
			$('#fdLoginMess').empty().append("<span id='fdLoginMess'><font color='red'>您还没有输入密码！</font></span>");
			flag=false;
			return flag;
		}
		if(flag){
			$.ajax({
				url : "<%=basePath%>/user/userLoginAction_login.do",
				dataType : "json",
				type : "post",
				data : form_.serialize(),
				success : function(data) {
					if (data.result == "error") {
						$('#fdLoginMess').empty().append("<span id='fdLoginMess'><font color='red'>学号或者密码错误！</font></span>");
					} else {
						location.href = "<%=basePath%>/user/userLoginAction_goHome.do";
							}
						},
						error : function(errorThrown) {
						}
					});
		}
	}

	//回车键登录
	$("div.loginPanel").keydown(function(e) {
		var e = e || event, keycode = e.which || e.keyCode;
		if (keycode == 13) {
			return login();
		}
	});
	/*获取焦点用empty事件清除内容 */
	function Onfocus(id) {
		$(id).select();
		$('#fdLoginMess').empty();
	}
</script>
</html>