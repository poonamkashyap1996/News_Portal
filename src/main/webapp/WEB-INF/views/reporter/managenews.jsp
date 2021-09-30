<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="../css/bootstrap.min.css">         
<script src="../js/bootstrap.min.js"></script>   
<meta charset="UTF-8">
<title>ManageNews</title>
</head>
<%@ include file="../../../jsp/headerreporter.jsp" %>
<body>
<h5 align="center" style="color: red;">${message}</h5>
<table style="width: 100%">
		<tr>
		<th align="left"><a href="welcome">Back</a></th>
					
		</tr>		
	</table>
	
	<div class="container">
	<h3 align="center">News List</h3>
	<table class="table">
		
		<tr>
		<th>ID</th>
			<th>Editor Name</th>
			<th>Title</th>
			<th>Description</th>
			<th>Content</th>
			<th>Date</th>
			<th>Category</th>
				<th>Update</th>
			<th>Delete</th>
		</tr>
		<tbody>
		<c:forEach var="v" items="${requestScope.listnews }">
		<tr>
		<td>${v.id}</td>
		<td>${v.editor_name}</td>
	<!--  	<td><img  src="data:image/png;charset=utf8;base64,${v.image}" width="240" height="300"/></td> -->
		<td>${v.title}</td>
		<td>${v.description}</td>
		<td>${v.content}</td>
		<td>${v.date}</td>
		<td>${v.category}</td>
		<td><a href="<spring:url value='/admin/updatenews?vid=${v.id}'/>">Update</a></td>
		<td><a href="<spring:url value='/admin/deletenews?vid=${v.id}'/>">Delete</a></td>
		</tr>
		</c:forEach>
		</tbody>
	</table>
	</div>
	<br>
</body>
<%@ include file="../../../jsp/footer.jsp" %>
</html>