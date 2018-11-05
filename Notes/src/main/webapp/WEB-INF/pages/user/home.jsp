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

<style type="text/css">
#content {
	
}

#left-menu {
	float: left;
}

#right-content {
	width: 81%;
	float: left;
}

#content-navbar {
	width: 150px;
}

#content-iframe {
	border:none;
	width: 980px;
	height: 650px;
}
</style>
</head>
<body>
	<div id="navbar">
		<nav class="navbar navbar-default">
			<div class="container">
				<div class="navbar-header">
					<a class="navbar-brand" href="#">Network Notes</a>
				</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse"
					id="bs-example-navbar-collapse-1">
					<form class="navbar-form navbar-left">
						<div class="form-group">
							<input type="text" class="form-control" placeholder="本站笔记内容搜索">
						</div>
						<button type="submit" class="btn btn-default">搜索</button>
					</form>
					<ul class="nav navbar-nav navbar-right">
						<li><a href="#">欢迎您,${sessionScope.user.nickname }</a></li>
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown" role="button" aria-haspopup="true"
							aria-expanded="false">个人设置 <span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="#">修改密码</a></li>
								<li><a href="#">个人信息</a></li>
								<li><a href="#">写笔记</a></li>
								<li class="divider"></li>
								<li><a href="${WEBPATH }/userLogOut">注销</a></li>
							</ul></li>
					</ul>
				</div>
				<!-- /.navbar-collapse -->
			</div>
			<!-- /.container-fluid -->
		</nav>
	</div>
	<div class="container" id="content">
		<div id="left-menu">
			<ul class="nav nav-pills nav-stacked" id="content-navbar">
				<li><a href="#">优秀笔记</a></li>
				<li><a href="#">最新笔记</a></li>
				<li><a href="${WEBPATH }/userNotes" target="content">我的笔记</a></li>
				<li><a href="${WEBPATH }/userNotes" target="content">我的学习计划</a></li>
			</ul>
		</div>

		<div id="right-content">
			<iframe id="content-iframe" name="content"
				src="${WEBPATH }/userNotes"></iframe>
		</div>

	</div>

</body>
</html>