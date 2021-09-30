<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%--import JSTL supplied core tag library --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ManageUsers</title>
</head>
<%@ include file="../../../jsp/headeradmin.jsp"%>
<body>
<h5 align="center" style="color: red;">${message}</h5>
<table style="width: 100%">
		<tr>
		<th align="left"><a href="welcome">Back</a></th>
						
		</tr>		
	</table>
<div class="container">
	<h3 align="center">Reporter List</h3>
	<table class="table">
		
			<tr>
				<th>ID</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Gender</th>
				<th>Email</th>
				<th>Role</th>
				<th>Update</th>
				<th>Delete</th>
			</tr>
		
		<tbody>
			<c:forEach var="v" items="${requestScope.listuser }">
				<tr>
					<td>${v.id}</td>
					<td>${v.fname}</td>
					<td>${v.lname}</td>
					<td>${v.gender}</td>
					<td>${v.email}</td>
					<td>${v.role}</td>
					<td><a
						href="<spring:url value='/admin/updatereporter?vid=${v.id}'/>">Update</a></td>
					<td><a
						href="<spring:url value='/admin/deletereporter?vid=${v.id}'/>">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	</div>
</body>
<%@ include file="../../../jsp/footer.jsp"%>
</html>