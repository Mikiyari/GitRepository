<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Your Network Note</title>
<%
	pageContext.setAttribute("WEBPATH", request.getContextPath());
%>
<script src="static/jquery-3.3.1/jquery-3.3.1.min.js"></script>
<script src="static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<link href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<style type="text/css">
body {
	background-image: url("images/1.jpg");
	background-size: 100%;
}

#content {
	padding-top: 100px;
	width: 100%;
	height: 600px;
	background-color: rgba(0, 0, 0, 0.3);
}

#login {
	padding: 20px 20px;
	height: 350px;
	width: 450px;
	margin: 0px auto;
	border-radius: 5px;
	box-shadow: 1px 1px 2px 2px;
	color: white;
}

#title {
	text-align: center;
	margin-bottom: 50px;
}
</style>
</head>
<body>
	<nav class="navbar">
		<div class="container">
			<div class="row">
				<div class="col-md-4">
					<div class="navbar-header">
						<a class="navbar-brand" href="${WEBPATH }/home">Notes后台管理系统</a>
					</div>
				</div>
				<div class="col-md-8">
					<div class="collapse navbar-collapse">
						<ul class="nav navbar-nav navbar-right">
							<li><a href="#">About Notes</a></li>
							<li><a href="#">Our Services</a></li>
							<li><a href="#">FAQ</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</nav>

	<div id="content">
		<div id="login">
			<div id="title">
				<h1>欢迎管理员登陆</h1>
			</div>
			<form class="form-horizontal" action="${WEBPATH }/managerdologin" method="post">
				<div class="form-group">
					<label class="col-sm-2 control-label">用户名</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="username" name="username"
							placeholder="username">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">密码</label>
					<div class="col-sm-10">
						<input type="password" class="form-control" id="password" name="password"
							placeholder="password">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-12">
						<button type="submit" class="btn btn-success btn-block">登陆</button>
					</div>
				</div>
			</form>
		</div>
	</div>
</body>
</html>