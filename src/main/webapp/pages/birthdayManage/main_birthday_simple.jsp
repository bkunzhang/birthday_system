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
	<script type="text/javascript">
		function detail(infoId){
			debugger;
			$.ajax({ 
				type: 'GET',
				url: '<%=basePath %>info/getInfo.love',
				data: {infoId:infoId},
				dataType : 'json',
				async : false,
		        cache : false,
				success: function(data){
					debugger;
					$('#infoName').val(data.infoName);
					var birthday = new Date(data.infoBirthday);
					alert(birthday);
					$('#infoBirthday').attr('placeholder','<fmt:formatDate value="${birthday}" pattern="yyyy-MM-dd"/>');
					if(data.infoSex =='女'){
						$('#infoSex').value('<option value="女">女</option><option value="男">男</option>');
					}else{
						$('#infoSex').html('<option value="男">男</option><option value="女">女</option>');
					}
					var img = '<%=basePath %>imgs/'+data.infoPhoto;
					$('#infoPhoto').attr('src',img);
					
		      	},
				error: function(XMLHttpRequest, textStatus, errorThrown){
					alert(textStatus+",怕是连接超时了^_^....");
				}
			});
			
			$('#myModal').modal('show');
		}
	</script>

</head>
<body>
	<a href="javascript:void(0);" class="list-group-item active">
		亲友管理
		<button  class="btn btn-primary btn-lg" onclick="change();">切换</button>
	</a>
	<c:forEach var="bean" items="${data }">
		<button id="${bean.infoId }" class="btn btn-primary btn-lg" data-toggle="modal" onclick="detail(${bean.infoId });"  class="list-group-item">${bean.infoName }---
			<fmt:formatDate value="${bean.infoBirthday }" pattern="yyyy年MM月dd日" /> 
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</button>
	</c:forEach>
    
    <!-- 模态框（Modal） -->
    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	    <div class="modal-dialog">
	        <div class="modal-content">
	            <div class="modal-header">
	                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
	                <h4 class="modal-title" id="myModalLabel">${bean.infoName }</h4>
	            </div>
	            <form class="form-horizontal" role="form" action="<%=basePath %>info/updateInfo.love">
		            <div class="modal-body">
							<div class="form-group">
								<label for="infoName" class="col-sm-2 control-label">名字</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="infoName" value="获取中....">
								</div>
							</div>
							<div class="form-group">
								<label for="infoBirthday" class="col-sm-2 control-label">生日</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="infoBirthday" value="获取中...." >
								</div>
							</div>
							<div class="form-group">
								<label for="infoSex" class="col-sm-2 control-label">性别</label>
								<div class="col-sm-10">
									<select class="form-control" id="infoSex">
									</select>
								</div>
							</div>
							<div class="form-group">
								<label for="infoPhoto" class="col-sm-2 control-label">图片</label>
								<div class="col-sm-10">
									<img src="" id="infoPhoto" style="width: 220px;height:260px;"/>
								</div>
							</div>
							<div class="form-group">
								<div class="col-sm-offset-2 col-sm-10">
									<div class="checkbox">
										<label> <input type="checkbox"> 三天 </label>
									</div>
								</div>
							</div>
		            </div>
		            <div class="modal-footer">
		                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
		                <input type="submit" class="btn btn-primary" value="更新"/>
		            </div>
	            </form>
	        </div><!-- /.modal-content -->
	    </div><!-- /.modal -->
	</div>
	<script>
		function change(){
		 location.href = '<%=basePath %>info/InfosPhoto.love';
		}
	</script>
</body>
</html>