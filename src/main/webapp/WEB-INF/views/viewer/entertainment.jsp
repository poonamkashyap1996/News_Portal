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
<title>Insert title here</title>
</head>
<%@ include file="../../../jsp/headerviewer.jsp" %>
<body>
<table style="width: 100%">
		<tr>
		<th align="left"><a href="welcome">Back</a></th>
					
		</tr>		
	</table>
	
	<div class="container">
	<table class="table">
		
		<tr>
		<th>ID</th>
			<th>Editor Name</th>
			<th>Title</th>
			<th>Description</th>
			<th>Content</th>
			<th>Date</th>
			<th>Category</th>
		</tr>
		<c:forEach var="v" items="${requestScope.listentertainment }">
		<tr>
		<td>${v.id}</td>
		<td>${v.editor_name}</td>
		<td>${v.title}</td>
		<td>${v.description}</td>
		<td>${v.content}</td>
		<td>${v.date}</td>
		<td>${v.category}</td>
		
		</tr>
		</c:forEach>
	</table>
	</div>
</body>
<%@ include file="../../../jsp/footer.jsp" %>
</html>