<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/public/base_public.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<!--为了确保适当的绘制和触屏缩放,禁用其缩放（zooming）功能-->
	<meta name="viewport"
		content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=no">
	<!--/chrome内核,ie用最高内核渲染-->
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<!--ios中数字不会已电话的方式展现-->
	<meta name="format-detection" content="telephone=no">
	<meta name="renderer" content="webkit">
	<title>${nickName }的空间</title>

</head>
<body class="bg">
	<div class="top-content">
		<div class="inner-bg">
			<div class="container">
				<div class="row">
					<div class="col-sm-6 col-sm-offset-3 form-box">
						<div class="form-bottom">
							<div class="form-group">
								<div class="col-sm-12">账户</div>
								<div class="col-sm-12">${bean.UName }</div>
							</div>
							<div class="form-group">
								<div class="col-sm-12">昵称</div>
								<div class="col-sm-12">${bean.UNick }</div>
							</div>
							<div class="form-group">
								<div class="col-sm-12">邮件</div>
								<div class="col-sm-12">${bean.UEmail }</div>
							</div>
							<div class="form-group">
								<div class="col-sm-12">图片</div>
								<div class="col-sm-12">
								<img style="height: 360px; width: 240px"  alt="美美哒" src="<%=basePath %>imgs/${bean.UPhoto }"> </div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>