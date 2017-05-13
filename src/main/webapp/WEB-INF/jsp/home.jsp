<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@include file="base.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${ctx }assets/bootstrap/css/bootstrap.css" />
</head>
<body>

<%-- <h2>这是首页</h2>
<a href="${ctx }logout">登出</a> --%>

<div class="container theme-showcase" role="main">
    <div class="row">
		<div class="col-lg-12">
			<nav class="navbar navbar-default">
				 <div class="container-fluid">
					<div class="collapse navbar-collapse">
						<ul	class="nav navbar-nav">
							<li><a href="#">喵，欢迎来天猫</a></li>
							<li><a href="#">请登录</a></li>
							<li><a href="#">免费注册</a></li>
						</ul>
						<ul class="nav navbar-nav navbar-right">
							<li>
								<a href="#" class="dropdown-toggle" data-toggle="dropdown">我的淘宝<span class="caret"></span></a>
								<ul class="dropdown-menu">
									<li><a  href="#">已买到的宝贝</a></li>
									<li><a  href="#">已卖出的宝贝</a></li>
								</ul>
							</li>
							<li><a href="#"><span class="glyphicon glyphicon-heart"></span>我关注的品牌</a></li>
						</ul>
					</div>
				 </div>
			</nav>
		</div>
    </div>
    <div class="row">
		<div class="col-lg-12">
		</div>
	</div>
    <div class="row"></div>
</div> <!-- /container -->
    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="${ctx }assets/common/jquery.min.js"></script>
    <script src="${ctx }assets/bootstrap/js/bootstrap.min.js"></script>

    

</body>
</html>