<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
<title>学生部门综合管理系统</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="${pageContext.request.contextPath}/assets/css/dpl-min.css"
	rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/assets/css/bui-min.css"
	rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/assets/css/main.css"
	rel="stylesheet" type="text/css" />
</head>
<body>
	<div class="header">
		<div class="dl-title">
			<span class="">数学与统计学院</span>
		</div>
		<div class="dl-log">
			欢迎您，<span class="dl-log-user">冯胜意</span> <a href="###" title="退出系统"
				class="dl-log-quit">[退出]</a>
		</div>
	</div>
	<div class="content">
		<div class="dl-main-nav">
			<ul id="J_Nav" class="nav-list ks-clear">
				<li class="nav-item dl-selected"><div
						class="nav-item-inner nav-storage">首页</div></li>
				<li class="nav-item"><div class="nav-item-inner nav-inventory">个人信息</div></li>
				<li class="nav-item"><div class="nav-item-inner nav-inventory">校内热点</div></li>
				<li class="nav-item"><div class="nav-item-inner nav-inventory">最新活动</div></li>
				<li class="nav-item"><div class="nav-item-inner nav-inventory">部门</div></li>
				<li class="nav-item"><div class="nav-item-inner nav-inventory">联系管理员</div></li>
			</ul>
		</div>
		<ul id="J_NavContent" class="dl-tab-conten">

		</ul>

	</div>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/assets/js/jquery-1.8.1.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/assets/js/bui-min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/assets/js/config-min.js"></script>
	<script>
		BUI.use('common/main', function() {
			var config = [ {
				id : 'index',
				menu : [ {
					text : '首页内容',
					items : [ {
						id : 'main-menu',
						text : '顶部导航',
						href : 'main/menu.php'
					}, {
						id : 'second-menu',
						text : '二级菜单',
						href : 'main/second-menu.php'
					} ]
				}, {
					text : '校內站点导航',
					items : [ {
						id : 'main-menu',
						text : '顶部导航',
						href : 'main/menu.php'
					}, {
						id : 'second-menu',
						text : '二级菜单',
						href : 'main/second-menu.php'
					} ]
				} ]
			}, {
				id : 'user',
				menu : [ {
					text : '个人信息管理',
					items : [ {
						id : 'introduce',
						text : '个人信息',
						href : '../test/user_info.jsp'
					}, {
						id : 'introduce',
						text : '当前审核',
						href : '../test/user_info.jsp'
					}, {
						id : 'introduce',
						text : '参与活动',
						href : '../test/user_info.jsp'
					} ]
				}, {
					text : '参与活动管理',
					items : [ {
						id : 'introduce',
						text : '所有活动',
						href : '../test/user_info.jsp'
					}, {
						id : 'introduce',
						text : '已报名的活动',
						href : '../test/user_info.jsp'
					}, {
						id : 'introduce',
						text : '已结束活动',
						href : '../test/user_info.jsp'
					} ]
				}, {
					text : '部门管理',
					items : [ {
						id : 'introduce',
						text : '我的部门',
						href : '../test/user_info.jsp'
					}, {
						id : 'introduce',
						text : '部门最新活动',
						href : '../test/user_info.jsp'
					} ]
				},{
					text : '其他',
					items : [ ]
				} ]
			}, {
				id : 'Hot',
				menu : [ {
					text : '校内热点',
					items : [ {
						id : 'main-menu',
						text : '顶部导航',
						href : 'main/menu.php'
					}, {
						id : 'second-menu',
						text : '二级菜单',
						href : '../test/user_info.jsp'
					} ]
				} ]
			}, {
				id : 'Activity',
				menu : [ {
					text : '最新校园活动',
					items : [ {
						id : 'main-u',
						text : '活动列表',
						href : '../test/find.jsp'
					},{
						id : 'main-me',
						text : '审核中',
						href : 'main/menu.php'
					}, {
						id : 'second-men',
						text : '已审核',
						href : 'main/second-menu.php'
					}, {
						id : 'second-menu',
						text : '已结束',
						href : 'main/second-menu.php'
					} ]
				} ]
			}, {
				id : 'dapament',
				menu : [ {
					text : '部门信息',
					items : [ {
						id : 'main-menu',
						text : '部门基本信息',
						href : '../test/MyHtml.html'
					}, {
						id : 'second-menu',
						text : '部门人员',
						href : '../test/activity.jsp'
					} ]
				}, {
					text : '日常工作',
					items : [ {
						id : 'main-menu',
						text : '入部申请',
						href : '../test/MyHtml.html'
					}, {
						id : 'second-menu',
						text : '活动申请',
						href : '../test/activity.jsp'
					} ]
				},{
					text : '部门财务',
					items : [ {
						id : 'main-menu',
						text : '财务列表',
						href : '../test/MyHtml.html'
					}, {
						id : 'second-menu',
						text : '财务报告',
						href : '../test/activity.jsp'
					},{
						id : 'second-menus',
						text : '财务统计图',
						href : '../test/tu.jsp'
					},{
						id : 'second-menu',
						text : '报表',
						href : '../test/activity.jsp'
					} ]
				} ]
			}, {
				id : 'menu',
				menu : [ {
					text : '管理员',
					items : [ {
						id : 'main-menu',
						text : '用户管理',
						href : 'main/menu.php'
					},

					{
						id : 'mu',
						text : '角色管理',
						href : '../test/roleIndex.jsp'
					}, {
						id : 'second-menu',
						text : '维护报告',
						href : 'main/second-menu.php'
					} ]
				} ]
			} ];
			new PageUtil.MainPage({
				modulesConfig : config
			});
		});
		
	</script>
</body>
</html>
