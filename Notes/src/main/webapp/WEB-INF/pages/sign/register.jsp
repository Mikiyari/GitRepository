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
	margin:0px;
	padding-top:20px;
	width: 100%;
	height: 600px;
	background-color: rgba(0, 0, 0, 0.3);
}

#register {
	margin: 0px auto;
	width: 400px;
	height: 100%;
	color: white;
	
}

</style>
</head>
<body>
	<nav class="navbar">
		<div class="container">
			<div class="row">
				<div class="col-md-4">
					<div class="navbar-header">
						<a class="navbar-brand" href="${WEBPATH }/home">NETWORK NOTES</a>
					</div>
				</div>
				<div class="col-md-8">
					<div class="collapse navbar-collapse">
						<ul class="nav navbar-nav navbar-right">
							<li><a href="#">About Notes</a></li>
							<li><a href="#">Our Services</a></li>
							<li><a href="#">FAQ</a></li>
							<li><a class="btn btn-success" href="${WEBPATH }/signin">Sign in</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</nav>
	<div id="content">
		<div id="register">
			<div class="page-header text-center">
				<h1>注册</h1>
			</div>
				<form class="form-horizontal">
					<div class="form-group">
						<label class="col-sm-3 control-label">用户名</label>
						<div class="col-sm-9">
							<input type="text" class="form-control" id="username"
								placeholder="username">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-3 control-label">密码</label>
						<div class="col-sm-9">
							<input type="password" class="form-control" id="password"
								placeholder="password">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-3 control-label">昵称</label>
						<div class="col-sm-9">
							<input type="password" class="form-control" id="nickname"
								placeholder="nickname">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-3 control-label">姓名</label>
						<div class="col-sm-9">
							<input type="password" class="form-control" id="name"
								placeholder="name">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-3 control-label">性别</label>
						<div class="col-sm-9">
							<input type="password" class="form-control" id="gender"
								placeholder="gender">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-3 control-label">年龄</label>
						<div class="col-sm-9">
							<input type="password" class="form-control" id="age"
								placeholder="age">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-3 control-label">所在学校</label>
						<div class="col-sm-9">
							<input type="password" class="form-control" id="school"
								placeholder="school">
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-8 col-sm-offset-3">
							<button type="submit" class="btn btn-success btn-block">注册</button>
						</div>
					</div>
				</form>
		</div>
	</div>
</body>
</html>