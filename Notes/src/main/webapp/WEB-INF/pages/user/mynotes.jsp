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
<title>Insert title here</title>
<style type="text/css">
.list-group{
	margin-top: 0px;
	margin-bottom: 0px;
}

</style>
</head>
<body>
    <c:forEach items="${userNotes }" var="note">
    <div class="list-group">
		<a href="#" class="list-group-item">
			<h4 class="list-group-item-heading">${note. title }</h4>
			<p class="list-group-item-text">${note. content }</p>
		</a>
	</div>
    </c:forEach>
</body>
</html>