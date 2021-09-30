<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%--import spring supplied form tag lib to enable data binding --%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UpdateNews</title>
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
				<td>Enter  Title</td>
				<td><form:input  path="title" /></td>
			</tr>
			<tr>
				<td>Enter  Content</td>
				<td><form:input  path="content" /></td>
			</tr>
			<tr>
				<td>Enter Description</td>
				<td><form:input path="description"  /></td>
			</tr>
			<tr>
				<td>Enter Date</td>
				<td><form:input type="date" path="date" /></td>
			</tr>
			<tr>
				<td>Enter Editor Name</td>
				<td><form:input path="editor_name" readonly="true" /></td>
			</tr>
			<tr>
				<td>Enter Category</td>
				<td><form:input path="category" readonly="true" /></td>
			</tr>
			<tr>
				<td>Enter Comment</td>
				<td><form:input path="comment" readonly="true" /></td>
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