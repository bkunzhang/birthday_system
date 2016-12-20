<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="/public/base_public.jsp" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
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


</head>
<body>
	<a href="javascript:void(0);" class="list-group-item active">
		亲友管理
	</a>
	<c:forEach var="bean" items="${data }">
		<button class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal" class="list-group-item">${bean.infoName }---
			<fmt:formatDate value="${bean.infoBirthday }" pattern="yyyy年MM月dd日" /> 
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</button>

    
    <!-- 模态框（Modal） -->
    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	    <div class="modal-dialog">
	        <div class="modal-content">
	            <div class="modal-header">
	                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
	                <h4 class="modal-title" id="myModalLabel">${bean.infoName }</h4>
	            </div>
	            <div class="modal-body">
					 <form class="form-horizontal" role="form">
						<div class="form-group">
							<label for="firstname" class="col-sm-2 control-label">名字</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="infoName" placeholder="${bean.infoName }">
							</div>
						</div>
						<div class="form-group">
							<label for="lastname" class="col-sm-2 control-label">生日</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="infoBirthday" placeholder="${bean.infoBirthday }">
							</div>
						</div>
						<div class="form-group">
							<label for="lastname" class="col-sm-2 control-label">性别</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="infoSex" placeholder="${bean.infoSex }">
							</div>
						</div>
						<div class="form-group">
							<label for="lastname" class="col-sm-2 control-label">生日</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="lastname" placeholder="${bean.infoBirthday }">
							</div>
						</div>
						<%-- <div class="form-group">
							<label for="lastname" class="col-sm-2 control-label">图片</label>
							<div class="col-sm-10">
								<img src="<%=basePath %>imgs/${bean.infoPhoto }" style="width: 220px;height:260px;"/>
							</div>
						</div> --%>
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<div class="checkbox">
									<label> <input type="checkbox"> 三天 </label>
								</div>
							</div>
						</div>
					</form>
	            </div>
	            <div class="modal-footer">
	                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
	                <button type="button" class="btn btn-primary">更新</button>
	            </div>
	        </div><!-- /.modal-content -->
	    </div><!-- /.modal -->
	</div>

</c:forEach>
</body>
</html>