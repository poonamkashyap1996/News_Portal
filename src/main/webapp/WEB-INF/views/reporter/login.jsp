<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<link rel="stylesheet" href="../css/bootstrap.min.css">         
<script src="../js/bootstrap.min.js"></script>   

<meta charset="UTF-8">
<style>
	/* body {background-image:url(../../image/hi.png);} */
	body{background-color: #F2F3F4;}
</style>
<title>Reporter Login</title>
</head>
<!-- <body style="background-color: #F2F3F4;"> -->
<body >
	<%--Form will be submitted to the def action /user/login --%>
	<h1 align="center">Reporter Login</h1>
	</br>
	<div class="login100-more" style="background-image: url('../../../image/hi.png');">
	<form method="post">
		<table style=" margin: auto ;with:80%">
			<tr>
				<td>Enter User Email</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>Enter Password</td>
				<td><input type="password" name="password" /></td>
			</tr>
		</table>
		<h5 align="center">
		<input  type="submit" class="btn btn-primary" value="Login" />
		&emsp;
	<a href="register">Register new Reporter</a>
	</h5>
	
	</form>
	</div>

</body>
</html>