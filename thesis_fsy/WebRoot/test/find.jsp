<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="utf-8">
<title>搜索页</title>
<!-- 此文件为了显示Demo样式，项目中不需要引入 -->
<link href="../../assets/code/demo.css" rel="stylesheet">
 
  <link href="http://g.alicdn.com/bui/bui/1.1.21/css/bs3/dpl.css" rel="stylesheet">
  <link href="http://g.alicdn.com/bui/bui/1.1.21/css/bs3/bui.css" rel="stylesheet">
 
</head>
<body>
  <div class="demo-content">
    
<!-- 搜索页 ================================================== -->
  <form id="searchForm" class="form-horizontal" tabindex="0" style="outline: none;">
    <div class="row">
      <div class="span24">
      <h2 align="center"></h2>
          <div class="row">
            <div class="control-group span8">
              <label class="control-label">部门：</label>
              <div class="controls">
                <select name="a" >
				  <option value="0">--请选择--</option>
				  <option value="1">学习部</option>
				  <option value="2">体策部</option>
				  <option value="3">团宣</option>
				  <option value="4">文策</option>
				</select>
              </div>
            </div>
            <div class="control-group span8">
              <label class="control-label">策划人：</label>
              <div class="controls">
                <input type="text" name="a" class="control-text">
              </div>
            </div>
            <div class="control-group span8">
              <label class="control-label">活动名称：</label>
              <div class="controls">
                <input type="text" name="a" class="control-text">
              </div>
            </div>
          </div>
          <div class="row">
          <div class="control-group span8">
              <label class="control-label">活动状态：</label>
              <div class="controls">
                <select name="status" >
				  <option value="0">--请选择--</option>
				  <option value="1">审核中</option>
				  <option value="2">已通过</option>
				  <option value="3">已结束</option>
				</select>
              </div>
            </div>
            <div class="control-group span10">
              <label class="control-label">起始日期：</label>
              <div class="controls bui-form-group" data-rules="{dateRange : true}">
                <input name="start" data-tip="{text : '起始日期'}" data-rules="{required:true}" data-messages="{required:'起始日期不能为空'}" class="input-small calendar" type="text"><label>&nbsp;-&nbsp;</label>
                <input name="end" data-rules="{required:true}" data-messages="{required:'结束日期不能为空'}" class="input-small calendar" type="text">
              </div>
            </div>
            <div class="form-actions span5">
              <button id="btnSearch" type="submit" class="button button-primary">搜索</button>
            </div>
          </div>
          
        
      </div>
    </div> 
  </form>
    <div class="search-grid-container">
      <div id="grid">
    </div>
    <script src="http://g.tbcdn.cn/fi/bui/jquery-1.8.1.min.js"></script>
    <script src="http://g.tbcdn.cn/fi/bui/bui-min.js?t=201309041336"></script> 
    <script type="text/javascript">
        var Grid = BUI.Grid,
          Store = BUI.Data.Store,
          columns = [
            { title: '负责人',width: 100,  sortable: false, dataIndex: 'a'},
            { title: '活动主题', width: 100, sortable: true, dataIndex: 'b', selectable: true },
            { title: '活动描述', width: 150, sortable: false, dataIndex: 'c', selectable: true ,renderer:function(value,obj){
                return value+':'+obj.d;
            }},
            { title: '举办单位',width: 100, sortable: true,  dataIndex: 'e',  showTip: true },
            { title: '活动经费',width: 100, sortable: true,  dataIndex: 'h'},
            { title: '活动时间', width: 100,sortable: true,  dataIndex: 'd'},
            { title: '活动状态',width: 100, sortable: true,  dataIndex: 'f'},
            { title: '操作', width: 300, dataIndex: 'g',renderer:function(value,obj){
            
              return '<span class="grid-command">报名参加</span>';
            }}
          ];
 
        var store = new Store({
            url : 'data.php',
            autoLoad:true,
            pageSize:10
          }),
          grid = new Grid.Grid({
            render:'#grid',
            loadMask: true,
            forceFit:true,
            columns : columns,
            store: store,
            plugins : [Grid.Plugins.CheckSelection,Grid.Plugins.AutoFit], //勾选插件、自适应宽度插件
            // 底部工具栏
            tbar:{
             items:[{
                    btnCls : 'button button-primary button-small',
                    text:'<h align="center">活动列表</h>',
                    handler : function(){
                      alert('命令一')
                    }
                }]
            },
            // 顶部工具栏
            bbar : {
              //items 也可以在此配置
              // pagingBar:表明包含分页栏
              pagingBar:true
            }
          });
 
        grid.render();
 
        //创建表单，表单中的日历，不需要单独初始化
        var form = new BUI.Form.HForm({
          srcNode : '#searchForm'
        }).render();
 
        form.on('beforesubmit',function(ev) {
          //序列化成对象
          var obj = form.serializeToObject();
          obj.start = 0; //返回第一页
          store.load(obj);
          return false;
        });
    </script>
<!-- script end -->
  </div>
</body>
</html>       