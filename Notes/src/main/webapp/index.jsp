<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Your Network Note</title>
<%pageContext.setAttribute("WEBPATH", request.getContextPath());%>
<script src="static/jquery-3.3.1/jquery-3.3.1.min.js"></script>
<script src="static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<link href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<style type="text/css">
body {
	background-image: url("images/2.jpg");
	background-size: 100%;
}

a {
	color: black;
}

#carousel-example-generic {
	margin-top: 250px;
}

.item{
	height: 200px;
	text-align: center;
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
	<div id="carousel-example-generic" class="carousel slide" data-ride="carousel"
		data-pause="null" data-interval="3000">
		<ol class="carousel-indicators">
			<li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
			<li data-target="#carousel-example-generic" data-slide-to="1"></li>
			<li data-target="#carousel-example-generic" data-slide-to="2"></li>
		</ol>
		<div class="carousel-inner" role="listbox">
			<div class="item active">
					<h1>This is your notes</h1>
			</div>
			<div class="item">
					<h1>This is your notes</h1>
			</div>
			<div class="item">
					<h1>This is your notes</h1>
			</div>
		</div>
	</div>
</body>
</html>