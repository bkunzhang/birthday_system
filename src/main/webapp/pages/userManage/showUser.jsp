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
<body class="bg" style="background-image: url('<%=basePath %>imgs/tiankong.jpg');">
	<div class="top-content">
		<div class="inner-bg">
			<div class="container">
				<div class="row">
					<div class="col-sm-10 col-sm-offset-1 form-box">
						<div class="form-bottom">
							<%-- <div class="form-group">
								<label for="UName" class="col-sm-4 col-md-4 control-label">账户</label>
								<div class="col-sm-10">
									<input type="text" class="col-sm-8 col-md-8 form-control" id="UName" 
										   placeholder="请输入名字账户" value="${bean.UName }"/>
								</div>
							</div> --%>
							<div class="form-group">
								<label for="UName" class="col-sm-4 col-md-4 control-label">昵称</label>
								<div class="col-sm-10">
									<input type="text" class="col-sm-8 col-md-8 form-control" id="UNick" 
										   placeholder="请输入昵称" value="${bean.UNick }"/>
								</div>
							</div>
							<div class="form-group">
	
								<label for="UName" class="col-sm-4 col-md-4 control-label">邮件</label>
								<div class="col-sm-10">
									<input type="text" class="col-sm-8 col-md-8 form-control" id="UEmail" 
										   placeholder="请输入邮件" value="${bean.UEmail }"/>
								</div>
							</div>
							<div class="form-group">
								<label for="UName" class="col-sm-4 col-md-4 control-label">图片</label>
								<div class="col-sm-12">
									<img style="height: 360px; width: 240px"  alt="美美哒" src="<%=basePath %>imgs/${bean.UPhoto }">
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>