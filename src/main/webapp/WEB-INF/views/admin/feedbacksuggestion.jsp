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
<title>Suggestion</title>
</head>
<%@ include file="../../../jsp/headeradmin.jsp" %>
<body>

<h5 align="center" style="color: red;">${message}</h5>
<table style="width: 100%">
		<tr>
		<th align="left"><a href="feedbacklist">Back</a></th>
					
		</tr>		
	</table>
	
	<div class="container">
	<h3 align="center">News List</h3>
	<table class="table">
		
		<tr>
		<th>ID</th>
			<th>Feedback Type</th>
			<th>Title</th>
			<th>Description</th>
			<th>Date</th>
		</tr>
		<tbody>
		<c:forEach var="v" items="${requestScope.feedbackk }">
		<tr>
		<td>${v.id}</td>
		<td>${v.feedbacktype}</td>
		<td>${v.title}</td>
		<td>${v.description}</td>
		<td>${v.date}</td>
		
		</tr>
		</c:forEach>
		</tbody>
	</table>
	</div>
	<br>
	<br>
</body>
<%@ include file="../../../jsp/footer.jsp" %>
</html>