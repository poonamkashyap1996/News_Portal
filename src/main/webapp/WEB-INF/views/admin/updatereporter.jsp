<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%--import spring supplied form tag lib to enable data binding --%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UpdateReporter</title>
</head>
<%@ include file="../../../jsp/headeradmin.jsp" %>
<body>
<h5 align="center" style="color: blue;">${message}</h5>
	<form:form  method="post" modelAttribute="user">
		<table style="background-color: lightgrey; margin: auto;">
		<tr>
				<td>ID</td>
				<td><form:input  path="id" readonly="true"/></td>
			</tr>
		<tr>
				<td>Enter  First Name</td>
				<td><form:input  path="fname" /></td>
			</tr>
			<tr>
				<td>Enter  Last Name</td>
				<td><form:input  path="lname" /></td>
			</tr>
			<tr>
				<td>Enter User Email</td>
				<td><form:input path="email" readonly="true" /></td>
			</tr>
			<tr>
				<td>Enter User Password</td>
				<td><form:password path="password" showPassword="true"/></td>
			</tr>
			<tr>
				<td>Enter Gender</td>
				<td><form:input path="gender" readonly="true" /></td>
			</tr>
			<tr>
				<td>Enter Role</td>
				<td><form:input path="role" readonly="true" /></td>
			</tr>
			<tr>
				<td><input type="submit" class="btn btn-success" value="Update" /></td>
			</tr>
		</table>
	</form:form>
<br>
</body>
<%@ include file="../../../jsp/footer.jsp" %>
</html>