<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户管理</title>
<%
	pageContext.setAttribute("WEBPATH", request.getContextPath());
%>
<script src="static/jquery-3.3.1/jquery-3.3.1.min.js"></script>
<script src="static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<link href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<style type="text/css">
body {
	background-color: #D2B48C;
}
</style>
</head>
<body>
	<!-- 这是用户添加 -->
	<div class="modal fade" id="addUserModal" tabindex="-1">
		<div class="modal-dialog">
			<div class="modal-content">
				<form class="form-horizontal" action="${WEBPATH }/addUser"
					method="post">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">&times;</button>
						<h4 class="modal-title">添加</h4>
					</div>
					<div class="modal-body">
						<div class="form-group">
							<label class="col-sm-2 control-label">用户名</label>
							<div class="col-sm-10">
								<input type="text" name="username" class="form-control">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">密码</label>
							<div class="col-sm-10">
								<input type="text" name="password" class="form-control">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">昵称</label>
							<div class="col-sm-2">
								<input type="text" name="nickname" class="form-control">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">姓名</label>
							<div class="col-sm-10">
								<input type="text" name="realname" class="form-control">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">性别</label>
							<div class="col-sm-10">
								<label class="radio-inline"> <input type="radio"
									name="gender" id="sex1_add_input" value="男" checked="checked">男
								</label> <label class="radio-inline"> <input type="radio"
									name="gender" id="sex2_add_input" value="女">女
								</label>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">年龄</label>
							<div class="col-sm-2">
								<input type="number" name="age" class="form-control">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">学校</label>
							<div class="col-sm-10">
								<input type="text" name="school" class="form-control">
							</div>
						</div>

					</div>
					<div class="modal-footer">
						<button type="submit" class="btn btn-primary">确定</button>
						<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					</div>
				</form>
			</div>
		</div>
	</div>

	<!--  这是用户编辑 -->
	<div class="modal fade" id="updateUserModal" tabindex="-1">
		<div class="modal-dialog">
			<div class="modal-content">
				<form class="form-horizontal" action="${WEBPATH }/updateUser"
					method="post">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">&times;</button>
						<h4 class="modal-title">编辑</h4>
					</div>
					<div class="modal-body">
						<div class="form-group hidden">
							<label class="col-sm-2 control-label">id</label>
							<div class="col-sm-10">
								<input type="text" id="id" name="id" class="form-control">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">用户名</label>
							<div class="col-sm-10">
								<input type="text" id="username" name="username" class="form-control">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">密码</label>
							<div class="col-sm-10">
								<input type="text" id="password" name="password"
									class="form-control">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">昵称</label>
							<div class="col-sm-2">
								<input type="text" id="nickname" name="nickname"
									class="form-control">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">姓名</label>
							<div class="col-sm-10">
								<input type="text" id="realname" name="realname"
									class="form-control">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">性别</label>
							<div class="col-sm-10">
								<label class="radio-inline"> <input type="radio"
									name="gender" id="sex1_add_input" value="男" checked="checked">男
								</label> <label class="radio-inline"> <input type="radio"
									name="gender" id="sex2_add_input" value="女">女
								</label>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">年龄</label>
							<div class="col-sm-2">
								<input type="number" id="age" name="age" class="form-control">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">学校</label>
							<div class="col-sm-10">
								<input type="text" id="school" name="school"
									class="form-control">
							</div>
						</div>
					</div>
					<div class="modal-footer">
						<button type="submit" class="btn btn-primary">确定</button>
						<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	<div class="container">
		<div class="jumbotron">
			<div class="row">
				<a class="btn btn-success" data-toggle="modal"
					data-target="#addUserModal">新增</a> <a class="btn btn-danger"
					id="deleteUsers">删除</a>
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
							<th><input type="checkbox" id="check_all"></th>
							<th>#</th>
							<th>用户名</th>
							<th>密码</th>
							<th>昵称</th>
							<th>姓名</th>
							<th>性别</th>
							<th>年龄</th>
							<th>所在学校</th>
							<th>创建时间</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${users }" var="user">
							<tr>
								<td><input type="checkbox" class="check_item"></td>
								<td>${user.id }</td>
								<td>${user.username }</td>
								<td>${user.password }</td>
								<td>${user.nickname }</td>
								<td>${user.realname }</td>
								<td>${user.gender }</td>
								<td>${user.age }</td>
								<td>${user.school }</td>
								<td>${user.createtime }</td>
								<td>
									<button class="btn btn-primary btn-sm edit_btn">编辑</button>
									<button class="btn btn-danger btn-sm delete_btn">删除</button>
								</td>
							</tr>
						</c:forEach>
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

	<script type="text/javascript">
		$(".edit_btn").click(function() {
			var id = $(this).parents("tr").find("td:eq(1)").text();
			getUser(id);
			$("#updateUserModal").modal({
				backdrop : "static"
			});
		});

		function getUser(id) {
			$.ajax({
				url : "${WEBPATH}/findUser?id=" + id,
				type : "GET",
				success : function(result) {
					console.log(result);
					$("#id").val(result.id);
					$("#username").val(result.username);
					$("#password").val(result.password);
					$("#nickname").val(result.nickname);
					$("#realname").val(result.realname);
					$("#updateUserModal input[name=gender]").val(
							[ result.gender ]);
					$("#age").val(result.age);
					$("#school").val(result.school);
				}
			});
		}

		$("#check_all").click(function() {
			$(".check_item").prop("checked", $(this).prop("checked"));
		});

		$("#deleteUsers").click(
				function() {
					var usernames = "";
					var userids = "";
					$.each($(".check_item:checked"), function() {
						usernames += $(this).parents("tr").find("td:eq(2)")
								.text()
								+ ",";
						userids += $(this).parents("tr").find("td:eq(1)")
								.text()
								+ "-";
					});
					usernames = usernames.substring(0, usernames.length - 1);
					userids = userids.substring(0, userids.length - 1);
					if (confirm("确认删除[" + usernames + "]吗?")) {
						location.href = "${WEBPATH }/deleteUsers?ids="
								+ userids;
					}
				});
		$(".delete_btn").click(function() {
			id = $(this).parents("tr").find("td:eq(1)").text();
			if (confirm("确认删除吗？")) {
				location.href = "${WEBPATH }/deleteUser?id=" + id;
			}
		});
	</script>
</body>
</html>