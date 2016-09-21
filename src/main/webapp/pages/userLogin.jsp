<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <meta charset="utf-8">
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <meta http-equiv="X-UA-Compatible" content="IE=edge">
 <meta name="renderer" content="webkit">
<title>Insert title here</title>
<%@include file="/public/base_public.jsp" %>
</head>
<body style="background:silver">
<div class="container">
	<div class="row">
		 <div class="col-sm-6 col-sm-offset-3 form-box">
			<div class="form-top" >
		 		<div class="form-top-left">
		 			<h3>Login to our site</h3>
		     		<p>Enter your username and password to log on:</p>
		 		</div>
		 		<div class="form-top-right">
		 			<i class="fa fa-lock"></i>
		 		</div>
		     </div>

		    <div class="form-bottom" >
			<form class="form-horizontal" role="form">
				<div class="form-group">
					<!-- <label for="name" class="col-sm-2 control-label">账 号</label> -->
					<div class="col-sm-12 ">
						<input type="text" class="form-control" id="name" 
							   placeholder="请输入你的账号">
					</div>
				</div>
				<div class="form-group">
					<!-- <label for="password" class="col-sm-2 control-label">密 码</label> -->
					<div class="col-sm-12 ">
						<input type="password" class="form-control" id="password" 
							   placeholder="请输入你的密码">
					</div>
				</div>
				
				<div class="form-group">
					<div class="col-sm-12">
						<button type="submit" class="btn btn-primary">登录</button>
					</div>
				</div>
			</form>
			</div>
		</div>
	</div>
</div>
</body>
</html>