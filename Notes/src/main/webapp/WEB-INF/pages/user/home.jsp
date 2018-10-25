<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%
	pageContext.setAttribute("WEBPATH", request.getContextPath());
%>
<script src="static/jquery-3.3.1/jquery-3.3.1.min.js"></script>
<script src="static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<link href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<title>用户界面</title>
</head>
<body>
${user.nickname }, 您好! 欢迎您登陆本系统<br>
用户名${user.username }<br>
密码${user.password }<br>
昵称${user.nickname }<br>
姓名${user.realname }<br>
性别${user.gender }<br>
年龄${user.age }<br>
学校${user.school }<br>
</body>
</html>