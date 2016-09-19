<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@include file="/public/base_public.jsp" %>
</head>
<body>
	<div>
		
<form class="form-horizontal" role="form">
	<div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">账 号</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="name" 
				   placeholder="请输入你的账号">
		</div>
	</div>
	<div class="form-group">
		<label for="lastname" class="col-sm-2 control-label">密 码</label>
		<div class="col-sm-10">
			<input type="password" class="form-control" id="password" 
				   placeholder="请输入你的密码">
		</div>
	</div>
	<div class="form-group">
		<div class="col-sm-offset-2 col-sm-10">
			<div class="checkbox">
				<label>
					<input type="checkbox"> 请记住我
				</label>
			</div>
		</div>
	</div>
	<div class="form-group">
		<div class="col-sm-offset-2 col-sm-10">
			<button type="submit" class="btn btn-default">登录</button>
		</div>
	</div>
</form>
	</div>
</body>
</html>