<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="/public/base_public.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!--为了确保适当的绘制和触屏缩放,禁用其缩放（zooming）功能-->
    <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=no">
    <!--/chrome内核,ie用最高内核渲染-->
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <!--ios中数字不会已电话的方式展现-->
    <meta name="format-detection" content="telephone=no">
    <meta name="renderer" content="webkit">
    <title>${nickName } 的空间 </title>

    <link rel="stylesheet" href="<%=basePath %>css/main.css">
    <style type="text/css">
        /*设置背景，可用jquery的backstretch设置*/
        .bg {
            background:url('../imgs/bg1.jpg') top center no-repeat ;
            background-size:100% 100%;
        }
    </style>
    <!--左侧导航插件，和h5的nav冲突-->
    <!--<link rel="stylesheet" href="../css/navigation/responsive-nav.css">-->


</head>
<body class="bg" >
    <a id="tips" name="tips" >&nbsp;</a>
    <!--顶部：绝对部位-->
    <div id="top" name="top" class="top">
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="./userLogin.html">返回首页</a>
                </div>
                <div  class="navbar-right">
                    <ul class="nav navbar-nav">
                        <li><a href="#"><span class="glyphicon glyphicon-user "></span> 注册</a></li>
                        <li><a href="#"><span class="glyphicon glyphicon-log-in "></span> 登录</a></li>
                    </ul>
                </div>
            </div>
        </nav>
    </div>

    <!--中部：左边选项卡，右边功能操作-->
    <div id="content" class="content">

        <div id="left" class="left">
            <ul class="nav nav-pills nav-stacked">
                <li ><a onclick="setSrc('https://www.baidu.com/')" href="javascript:;" data-toggle="tab">个人信息</a></li>
                <li><a onclick="setSrc('https://www.taobao.com/')" href="javascript:;" data-toggle="tab" >基友管理</a></li>
                <li><a onclick="setSrc('http://passionate.herokuapp.com/')" href="javascript:;" data-toggle="tab">群组管理</a></li>
            </ul>
        </div>

        <div id="right" style="height: 100%">
            <div style="display: none">右上部分</div>
            <div id="main" name="main" class="main">
                <iframe id="iframe_content" scrolling="no" class="embed-responsive-item" src="http://www.baidu.com" style="width: 100%;height: 100%"></iframe>
            </div>
        </div>

    </div>

    <!--右下角突出层-->
    <div style="background-color: #204d74; z-index: 11;" >
        <div class="relation" draggable="true" onclick="javascript:alert('sb?');">
            <!--<ul>
                <li class="" >1</li>
                <li class="" >2</li>
                <li class="" >3</li>
            </ul>-->

        </div>
        <!--H5的锚点要在a标签里面设置text值,null值也可以-->
        <div class="relation2" draggable="true" onclick="javascript:location.href='#tips'"></div>
    </div>


<script type="text/javascript" src="<%=basePath %>js/navigation/responsive-nav.js"></script>
<script style="text/javascript">
    function setSrc(srcName){
        $('#iframe_content').attr("src",srcName);
    }
</script>
</body>
</html>