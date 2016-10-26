<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/public/base_public.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!--为了确保适当的绘制和触屏缩放,禁用其缩放（zooming）功能-->
    <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=no">
    <!--/chrome内核,ie用最高内核渲染-->
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <!--ios中数字不会已电话的方式展现-->
    <meta name="format-detection" content="telephone=no">
    <meta name="renderer" content="webkit">

    <title>北辰生日录平台</title>
    <link rel="stylesheet" href="<%=basePath %>css/style.css">
	<style type="text/css">
        /*设置背景，可用jquery的backstretch设置*/
        /*.bg {
            background:url('../imgs/bg1.jpg') top center no-repeat ;
            background-size:100% 100%;
        }*/
        html, body{
            height: 100%;/*高度只会到达相应的高度*/
            width: 100%;/*宽度自动拉伸全屏，所以可以不用设定*/
        }

    </style>

</head>
<body class="bg">
    <div class="top-content">
    <div class="inner-bg" >
    <div class="container">
        <div class="row">
            <div class="col-sm-6 col-sm-offset-3 form-box">
                <div class="form-top" >
                    <div class="form-top-left">
                        <h3>只属于你的生日录</h3>
                        <p>Enter your username and password to log on:</p>
                    </div>
                    <div class="form-top-right">
                        <i class="fa fa-lock"></i>
                    </div>
                </div>

                <div class="form-bottom" >
                    <form action="user/login.love" class="form-horizontal login-form" role="form" method="post" id="mainForm" name="mainForm">
                        <div class="form-group">
                            <!-- <label for="name" class="col-sm-2 control-label">账 号</label> -->
                            <div class="col-sm-12 ">
                                <label class="sr-only" for="name">Username</label>
                                <input name="uName" type="text" class="form-username form-control input-error" id="uName"
                                       placeholder="请输入你的账号">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="sr-only" for="password">Password</label>
                            <div class="col-sm-12 ">
                                <input name="uPassword" type="password" class="form-password form-control input-error" id="uPassword"
                                       placeholder="请输入你的密码">
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="col-sm-12">
                                <button type="submit" class="btn btn-primary" >登录</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
    </div>
    </div>
<script type="text/javascript" src="<%=basePath %>js/scripts.js"></script>
<script type="text/javascript">
	$(function(){
		creatToken('mainForm');
	});
	function creatToken(formId){
		$('#'+formId).append('<input id="polarisToken" name="polarisToken" type="hidden"/>');
		$('#'+formId).find('input[name="polarisToken"]').val(callId());
	}
	function callId(){
		var random = Math.floor(Math.random() * 10001);
	  	var id = (random + "_" + new Date().getTime()).toString();
	  	return id;
	}
</script>
</body>
</html>