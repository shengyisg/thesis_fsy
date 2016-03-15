<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>表单按纽</title>

<link type="text/css" rel="stylesheet" href="../bui/css/bs3/dpl-min.css">
<link type="text/css" rel="stylesheet" href="../bui/css/bs3/bui-min.css">
</head>

<script src="http://g.tbcdn.cn/fi/bui/jquery-1.8.1.min.js"></script>
<script src="http://g.alicdn.com/bui/seajs/2.3.0/sea.js"></script>
<script src="http://g.alicdn.com/bui/bui/1.1.21/config.js"></script>
<body>
	<div class="demo-content">
<div class="row">
						<div class="control-group span8">
							<div class="doc-content">
								<ul class="toolbar">
									<li><input type="button" class="button"
										name="buttonPassword" value="修改密码" />
									<li>
								</ul>
							</div>
						</div>
					</div>
		<div class="row">
			<div class="span24">
				<form class="form-horizontal well">
					<input type="hidden" name="fsyId" /> <input type="hidden"
						name="fsyPassdword" />
					<div class="row">
						<div class="control-group span8">
							<label class="control-label">学号：</label>
							<div class="controls">12110031011</div>
						</div>
						<div class="control-group span8">
							<label class="control-label">姓名：</label>
							<div class="controls">冯胜意</div>
						</div>
					</div>
					<div class="row">
						<div class="control-group span8">
							<label class="control-label">年级：</label>
							<div class="controls">大二</div>
						</div>
						<div class="control-group span8">
							<label class="control-label">所属部门：</label>
							<div class="controls">学习部</div>
						</div>
					</div>
					<div class="row">
						<div class="control-group span8">
							<label class="control-label">职务：</label>
							<div class="controls">副部长</div>
						</div>
						<div class="control-group span8">
							<label class="control-label">是否验证：</label>
							<div class="controls">
								<%-- ${1=11?'是':'否' } --%>
								否 <a href="#">去验证</a>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="control-group span8">
							<label class="control-label">权限等级：</label>
							<div class="controls">10</div>
						</div>
						<div class="control-group span8">
							<label class="control-label">上一次更新时间：</label>
							<div class="controls">2014-03-21</div>
						</div>
					</div>
					<div class="row">
						<div class="form-actions offset3">
							<button type="submit" class="button button-primary">保存</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript">    
var htm = '<form id="NameForm" action="/userinfo/account/updateAjax" class="form-horizontal"> '
	+'<input type="hidden" class="input-large" name="userId" />'
	+'<div class="control-groupp">'
	+ '<label class="control-label"><span class="red" >*</span>旧密码：</label>'
		+ '<div class="controls">'
		+ '<input type="text" class="input-large" name="realName"/>'
		+ '</div>'
	+ '<label class="control-label"><span class="red">*</span>新密码：</label>'
		+ '<div class="controls">'
		+ '<input type="text" class="input-large" name="idCard"/>'
		+ '</div>' +
	'</div>' + '</form>';
	
	BUI.use('bui/overlay', function(Overlay) {
		var dialog = new Overlay.Dialog({
			title : '密码修改',
			width : 500,
			height : 250,
			bodyContent : htm,
			success : function() {
				$.ajax({
					url : '/userinfo/updateAjax',
					type : 'post',
					data : form_.serialize(),
					success : function(data) {
						if (data.result == "success") {
							alert("修改成功");
							location.href = "";
						} else {
							alert("修改失败");
						}
					},
					error : function(errorThrown) {
					}
				});
				this.close();
			}
		});

		$("input[name='buttonPassword']").on('click', function() {
			dialog.show();
		});
	});
	</script>
</html>
