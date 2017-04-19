<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="/public/base_public.jsp" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

    <link rel="stylesheet" href="<%=basePath %>css/response/testCss.css">

</head>
<body class="bg" >

	<a href="javascript:void(0);" class="list-group-item active">
		亲友管理
		<button  class="btn btn-primary btn-lg" onclick="change();">切换</button>
	</a>
	 <c:forEach var="bean" items="${data }">
	 	<div></div>
		<figure class="test3" style="overflow: auto;" ><!--图片容器-->
		<img src="<%=basePath %>imgs/${bean.infoPhoto }" style="width: 320px;height:640px;"/>
		<figcaption>
			<h2>斜切动画</h2>
		    <p>${bean.infoName }</p>
		    <p>${bean.infoBirthday }</p>
		    <p>${bean.infoRelation }</p>
		</figcaption>
		</figure>
     </c:forEach>
     <div style="margin-bottom: 10px;">&nbsp;</div>
     
     <script>
		function change(){
		 location.href = '<%=basePath %>info/toIndex.love';
		}
	</script>
</body>
</html>