<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <meta charset="utf-8">
    <title>图形展示</title>
</head>
<body>
 
<div class="detail-section">
    <div id="canvas">
 
    </div>
</div>
 
<script src="http://g.tbcdn.cn/bui/acharts/1.0.32/acharts-min.js"></script>
<!-- https://g.alicdn.com/bui/acharts/1.0.29/acharts-min.js -->
 
 
  <script type="text/javascript">
    var chart = new AChart({
      theme : AChart.Theme.SmoothBase,
      id : 'canvas',
      width : 950,
      height : 400,
      xAxis : {
        type : 'category'
      },
      seriesOptions : {
          columnCfg : {
            allowPointSelect : true,
            xField : 'x',
            item : {
              cursor : 'pointer',
              stroke : 'none'
            }
          }
      },
      yAxis : {
        min : 0
      },
      series: [ {
        name: '部门活动经费',
        events : {
          itemclick : function (ev) {
            var point = ev.point,
              //item = ev.item, //点击的项
              obj = point.obj; //point.obj是点击的配置项的信息
            alert(obj.x); //执行一系列操作
          }/*,
          itemselected : function(ev){ //选中事件
 
          },
          itemunselected : function(ev){ //取消选中事件
 
          }
          */
        },
        data: [
          {x : '活动1',y : 50,attrs : {fill : '#7179cb'}},
          {x : '活动2',y : 30,attrs : {fill : '#6ed7ff'}},
          {x : '活动3',y : 100,attrs : {fill : '#79c850'}},
          {x : '活动4',y : 10,attrs : {fill : '#ffb65d'}},
          {x : '活动5',y : 70,attrs : {fill : '#98F5FF'}},
          {x : '活动6',y : 91,attrs : {fill : '#D15FEE'}},
        ]
      }]
 
    });
 
    chart.render();
  </script>
 
</body>
</html>