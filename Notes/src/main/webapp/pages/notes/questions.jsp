<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>提问管理</title>
<script src="static/jquery-3.3.1/jquery-3.3.1.min.js"></script>
<script src="static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<link href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
<div class="container">
		<div class="jumbotron">
			<div class="row">
				<a class="btn btn-success" href="#">新增</a>
				<a class="btn btn-danger" href="#">删除</a>
				<form class="form-inline pull-right">
					<div class="form-group">
						<input type="text" class="form-control" placeholder="Search">
					</div>
					<button type="submit" class="btn btn-default">查询</button>
				</form>
			</div>
			<div class="row">
				<table class="table table-bordered table-hover">
					<caption class="text-center">用户信息</caption>
					<thead>
						<tr>
							<th>账号</th>
							<th>密码</th>
							<th>昵称</th>
							<th>姓名</th>
							<th>性别</th>
							<th>年龄</th>
							<th>所在学校</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>www</td>
							<td>*******</td>
							<td>Meryy</td>
							<td>Merry</td>
							<td>女</td>
							<td>28</td>
							<td>上海交通大学</td>
							<td>
								<button class="btn btn-primary btn-sm">编辑</button>
								<button class="btn btn-danger btn-sm">删除</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="row">
				<div class="col-md-6">这是记录信息</div>
				<div class="col-md-3 col-md-offset-3">
					<nav>
						<ul class="pagination">
							<li><a href="#"><span aria-hidden="true">&laquo;</span></a></li>
							<li><a href="#">1</a></li>
							<li><a href="#">2</a></li>
							<li><a href="#">3</a></li>
							<li><a href="#">4</a></li>
							<li><a href="#">5</a></li>
							<li><a href="#"><span>&raquo;</span></a></li>
						</ul>
					</nav>
				</div>
			</div>
		</div>
	</div>
</body>
</html>