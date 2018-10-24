<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MANAGE NOTES</title>
<%
	pageContext.setAttribute("WEBPATH", request.getContextPath());
%>
<script src="static/jquery-3.3.1/jquery-3.3.1.min.js"></script>
<script src="static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<link href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<style type="text/css">
.div-content {
	display: inline-block;
}

#menulist {
	width: 180px;
	float: left;
}

#editcontent {
	float: left;
}

iframe {
	border: solid white;
	border-radius: 8px;
	width: 1333px;
	height: 650px;
}
</style>
</head>
<body>

	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Network Notes</a>
			</div>
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<form class="navbar-form navbar-left">
					<div class="form-group">
						<input type="text" class="form-control" placeholder="Search">
					</div>
					<button type="submit" class="btn btn-default">搜索</button>
				</form>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#">欢迎来到Notes后台管理系统</a></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown"> Mikiya<span class="caret"></span>
					</a>
						<ul class="dropdown-menu">
							<li><a href="#">我的主页</a></li>
							<li><a href="#">个人设置</a></li>
							<li class="divider"></li>
							<li><a href="#">注销</a></li>
						</ul></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="div-content" id="menulist">
		<div class="list-group">
			<a href="${WEBPATH }/home" class="list-group-item" target="content">首页</a>
			<a href="${WEBPATH }/findUsers" class="list-group-item"
				target="content">用户管理</a> <a data-toggle="collapse"
				href="#notescollapse" class="list-group-item">笔记管理 <span
				class="pull-right glyphicon glyphicon-chevron-down"></span>
			</a>
			<ul id="notescollapse" class="nav nav-stacked collapse">
				<li><a href="${WEBPATH }/findStudyNotes" target="content">学习笔记</a></li>
				<li><a href="${WEBPATH }/findErrorNotes" target="content">错误笔记</a></li>
				<li><a href="${WEBPATH }/findStudyPlans" target="content">学习计划</a></li>
			</ul>
			<a href="${WEBPATH }/findStudyQuestions" class="list-group-item" target="content">问题管理</a>
			<a href="${WEBPATH }/findComments" class="list-group-item" target="content">评论管理</a>
		</div>
	</div>

	<div class="div-content" id="editcontent">
		<iframe name="content"></iframe>
	</div>

</body>
</html>