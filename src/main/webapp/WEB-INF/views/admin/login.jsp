<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="../css/bootstrap.min.css">         
<script src="../js/bootstrap.min.js"></script>   

<meta charset="UTF-8">
<title>Admin Login</title>
</head>
<body>
	<h5 align="center" style="color:red;">${message}</h5>
	<%--Form will be submitted to the def action /user/login --%>
	<h1 align="center">Admin Login</h1>
	<br>
	<div class="container">
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
	</h5>
	</form>
</div>
</body>
</html>