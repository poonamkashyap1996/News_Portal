<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

</style>
<link rel="stylesheet" href="../css/bootstrap.min.css">
<script src="../js/bootstrap.min.js"></script>

<meta charset="UTF-8">
<title>Admin</title>
</head>
<%@ include file="../../../jsp/headeradmin.jsp" %>
<body>
	
	
	<h1 align="center">Welcome Admin : ${user_details.fname}</h1>
	<br>
	<br>
	<div class="container">
	<ul class="list-group">
		<li class="list-group-item"><h4 align="center">
				<a
				 href="managenews">Manage News </a>
			</h4></li>

		<li class="list-group-item">
			<h4 align="center">
				<a href="managereporter">Manage Reporter</a>
			</h4>
		</li>
		<li class="list-group-item">
			<h4 align="center">
				<a href="manageviewer">Manage Viewer</a>
			</h4>
		</li>
		<li class="list-group-item">
			<h4 align="center">
				<a href="feedbacklist">Feedback</a>
			</h4>
		</li>
	</ul>
	</div>
	
	<br>
	<br>
	<br>
	<br>
	<br>
</body>
<%@ include file="../../../jsp/footer.jsp" %>
</html>