<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
a:link, a:visited {
  background-color: purple;
  color: white;
  padding: 5px 15px;
  text-align: center;
  text-decoration:blink;
  display:inline-block;
}

a:hover, a:active {
  background-color: #d0c8df;
}
</style>
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="../css/bootstrap.min.css">         
<script src="../js/bootstrap.min.js"></script>   

<meta charset="UTF-8">
<title>Welcome Page</title>
</head>
<%@ include file="../../jsp/headerindex.jsp" %>
<body>
<!-- 
<div class="home-content-wrapper">
<div class="overlay-box">
<div class="container">
<div class="welcome-text">
<h1 align="center">
	NEWS PORTAL
	</h1>
<br>
	<br>
	<br>
	<br>
	<br>
	
		
	<h3 align="center">
		<a href="admin/login">Admin Login</a>
          &emsp; for space
	
		<a href="reporter/login">Reporter Login</a>
	&emsp;
	
		<a href="viewer/login">Viewer Login</a>
	</h3>
	
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	
	
	
	
	</div>
</div>
</div>
</div>
 -->

<h1 align="center">
<br>
	<br>
	NEWS PORTAL
	</h1>

	<br>
	<br>
	<br>
	<br>
		
	<h3 align="center">
		<a href="admin/login">Admin Login</a>
          &emsp; <!-- for space -->
	
		<a href="reporter/login">Reporter Login</a>
	&emsp;
	
		<a href="viewer/login">Viewer Login</a>
	</h3>
	
	<br>
	<br>
	<br>
	<br>
	<br>
	
	
	
	
	
</body>
<%@ include file="../../jsp/footer.jsp" %>
</html>