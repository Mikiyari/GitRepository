<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>评论管理</title>
<%
	pageContext.setAttribute("WEBPATH", request.getContextPath());
%>
<script src="static/jquery-3.3.1/jquery-3.3.1.min.js"></script>
<script src="static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<link href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
<div class="modal fade" id="addCommentModal" tabindex="-1">
		<div class="modal-dialog">
			<div class="modal-content">
				<form class="form-horizontal" action="${WEBPATH }/addComment"
					method="post">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">&times;</button>
						<h4 class="modal-title">添加笔记</h4>
					</div>
					<div class="modal-body">
						<div class="form-group">
							<label class="col-sm-2 control-label">评论者</label>
							<div class="col-sm-10">
								<input type="text" name="author" class="form-control">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">评论对象</label>
							<div class="col-sm-10">
								<input type="text" name="target" class="form-control">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">评论内容</label>
							<div class="col-sm-10">
								<textarea class="form-control" name="content" rows="3"></textarea>
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
	<div class="modal fade" id="updateCommentModal" tabindex="-1">
		<div class="modal-dialog">
			<div class="modal-content">
				<form class="form-horizontal"
					action="${WEBPATH }/updateComment" method="post">
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
							<label class="col-sm-2 control-label">评论人</label>
							<div class="col-sm-10">
								<input type="text" id="author" name="author" class="form-control">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">评论对象</label>
							<div class="col-sm-10">
								<input type="text" id="target" name="target" class="form-control">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">评论内容</label>
							<div class="col-sm-10">
								<textarea class="form-control" id="content" name="content"
									rows="3"></textarea>
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
				<a class="btn btn-success" data-toggle="modal" data-target="#addCommentModal">新增</a>
				<a class="btn btn-danger" id="deleteComments">删除</a>
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
							<th>评论人</th>
							<th>评论对象</th>
							<th>评论内容</th>
							<th>评论时间</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${comments }" var="comment">
							<tr>
								<td><input type="checkbox" class="check_item"></td>
								<td>${comment.id }</td>
								<td>${comment.author }</td>
								<td>${comment.target }</td>
								<td>${comment.content }</td>
								<td>${comment.createtime }</td>
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
		getQuestion(id);
		$("#updateCommentModal").modal({
			backdrop : "static"
		});
	});

	function getQuestion(id) {
		$.ajax({
			url : "${WEBPATH}/findComment?id=" + id,
			type : "GET",
			success : function(result) {
				$("#id").val(result.id);
				$("#author").val(result.author);
				$("#target").val(result.target);
				$("#content").val(result.content);
			}
		});
	}

	$("#check_all").click(function() {
		$(".check_item").prop("checked", $(this).prop("checked"));
	});

	$("#deleteComments").click(function() {
		var titles = "";
		var ids = "";
		$.each($(".check_item:checked"), function() {
			titles += $(this).parents("tr").find("td:eq(2)").text() + ",";
			ids += $(this).parents("tr").find("td:eq(1)").text() + "-";
		});
		titles = titles.substring(0, titles.length - 1);
		ids = ids.substring(0, ids.length - 1);
		if (confirm("确认删除[" + titles + "]吗?")) {
			location.href = "${WEBPATH }/deleteComments?ids=" + ids;
		}
	});
	$(".delete_btn").click(function() {
		id = $(this).parents("tr").find("td:eq(1)").text();
		if (confirm("确认删除吗？")) {
			location.href = "${WEBPATH }/deleteComment?id=" + id;
		}
	});
	</script>
</body>
</html>