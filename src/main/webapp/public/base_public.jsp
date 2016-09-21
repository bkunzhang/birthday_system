<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<!-- <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script> -->

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<!-- <script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script> -->

<!-- 新 Bootstrap 核心 CSS 文件 -->
<!-- <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css"> -->

<!-- 可选的Bootstrap主题文件（一般不用引入） -->
<!--<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap-theme.min.css"> -->

<script src="<%=basePath %>js/jquery-1.7.2.js"></script>
<script src="<%=basePath %>js/bootstrap/bootstrap.js"></script>
<link rel="stylesheet" href="<%=basePath %>css/bootstrap/bootstrap.css">
<link rel="stylesheet" href="<%=basePath %>css/bootstrap/bootstrap-theme.css">
<link rel="stylesheet" href="<%=basePath %>css/style.css">
