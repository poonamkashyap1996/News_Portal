<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="../css/bootstrap.min.css">
<script src="../js/bootstrap.min.js"></script>

<meta charset="UTF-8">
<title>Reporter</title>
</head>
<%@ include file="../../../jsp/headerreporter.jsp" %>
<body>
<div>
	
	<h1 align="center">Welcome Reporter :${user_details.fname}</h1>
</div>
<div class="container">
<ul class="list-group">
		<li class="list-group-item"><h4 align="center">
				<a href="addnews">Add News </a>
			</h4></li>
			<li class="list-group-item"><h4 align="center">
				<a href="managenews">Manage News </a>
			</h4></li>	
			</ul>
</div>
<br>
</body>
<%@ include file="../../../jsp/footer.jsp" %>
</html>