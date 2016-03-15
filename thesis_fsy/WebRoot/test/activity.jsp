<%@ page language="java" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<title>活动策划</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!-- <link href="resources/bui/css/dpl-min.css" rel="stylesheet" type="text/css" />
<link href="../assets/css/bui-min.css" rel="stylesheet" type="text/css" />
<link href="../assets/css/page-min.css" rel="stylesheet" type="text/css" /> -->

<script type="text/javascript" src="${pageContext.request.contextPath}/js/date/WdatePicker.js"></script>
<link type="text/css" rel="stylesheet"
	href="../bui/css/bs3/dpl-min.css">
<link type="text/css" rel="stylesheet"
	href="../bui/css/bs3/bui-min.css">
</head>

<body>
<div class="demo-content">
	<form name="userinfoAccountForm" action="/userinfo/account/"
		method="POST" class="form-horizontal">
		<h3 align="center">活动策划表</h3>
		<input type="hidden" name="fsyUserId" />
		<table class="table table-bordered" width=200px>
			<tr>
				<td width=15%>负责人:</td>
				<td width=35%><input type="text" size="18" /></td>
				<td width=15%>负责人电话:</td>
				<td width=35%><input type="text" size="18" /></td>
			</tr>
			<tr>
				<td width=15%>活动标题:</td>
				<td width=35%><input type="text" size="18" /></td>
				
				<td width=15%>活动经费预算：</td>
				<td width=35%><input type="text" size="18" /></td>
			</tr>
			<tr>
				<td>活动承办单位:</td>
				<td><input type="text" size="18"></td>
				
				<td>活动举办时间:</td>
				<td><input type="text" size="18" class="calendar bui-form-field-date bui-form-field" maxlength="50" size=20 onclick="WdatePicker()"/>
			</tr>
			<tr>
				<td>活动相关文件：</td>
				<td><input type="file" name="document" size="20" />
				</td>
				<td>活动审核状态：</td>
				<td>未提交</td>
			</tr>
			<tr>
				<td>活动备注：</td>
				<td colspan="3"><input type="text" size="18" /></td>
			</tr>
			<tr>
				<td>活动描述:</td>
				<td colspan="3"><textarea style="width: 583px; height: 87px;"></textarea></td>
			</tr>
			
		</table>
		<div class="row actions-bar">
			<div class="form-actions offset3">
				<%-- <c:if test="${editType=='edit'}">
  		<button 
  			onclick="$b.Submit(document.userinfoAccountForm, 'update');"
  			class="button button-primary">保存</button>
	</c:if> --%>
				<c:if test="${editType=='add'}">
					<button onclick="$b.Submit(document.userinfoAccountForm, 'save');"
						class="button button-primary">提交</button>
				</c:if>
			</div>
		</div>

	</form>
	<script type="text/javascript" src="../assets/js/jquery-1.8.1.min.js"></script>
	<script type="text/javascript" src="../assets/js/bui-min.js"></script>
	<!-- 如果不使用页面内部跳转，则下面 script 标签不需要,同时不需要引入 common/page -->
	<script type="text/javascript" src="../assets/js/config-min.js"></script>
	<script type="text/javascript">
    BUI.use('common/page'); //页面链接跳转
 
    BUI.use('bui/form',function (Form) {
      var form = new Form.HForm({
        srcNode : '#J_Form'
      });
 
      form.render();
    });
  </script>
</div>
</body>
</html>
