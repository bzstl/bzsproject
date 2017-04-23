<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="/WEB-INF/jsp/base.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>



</head>
<body>


<FORM id="loginform" name="loginform" action="${ctx }login.action"
		method="post">
用户名<input type="text" id="usercode"name="username" style="WIDTH: 130px" />
密码<input type="password" id="pwd" name="password" style="WIDTH: 130px" />
<input type="submit"class="btnalink" onclick="loginsubmit()" value="登&nbsp;&nbsp;录" />
</form>


	
</body>
</html>