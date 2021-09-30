<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="../css/bootstrap.min.css">
<script src="../js/bootstrap.min.js"></script>

<meta charset="UTF-8">
<title>Viewer</title>
</head>
<%@ include file="../../../jsp/headerviewer.jsp" %>
<body>

	
	<h2 align="center">Welcome Viewer : ${user_details.fname}</h2>
	<br>
	<br>
	<div class="container">
	
	<h4  align="center" >
		<a href="politics">Politics</a>
	&ensp;
		<a href="entertainment">Entertainment</a>
	&ensp;
		<a href="education">Education</a>
	&ensp;
		<a href="sports">Sports</a>
	&ensp;
		<a href="health">Health</a>
	&ensp;
		<a href="industry">Industry</a>
	&ensp;
		<a href="economy">Economy</a>
	</h4>
	</div>
</body>
<%@ include file="../../../jsp/footer.jsp" %>
</html>