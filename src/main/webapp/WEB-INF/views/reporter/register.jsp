<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeLeaf.org">
<head>
<link rel="stylesheet" href="../css/bootstrap.min.css">         
<script src="../js/bootstrap.min.js"></script>   

<meta charset="ISO-8859-1">
<title>Register Reporter</title>
</head>
<%@ include file="../../../jsp/headerreporter.jsp" %>
<body>
<h5 align="center" style="color:green;">${message}</h5>
	
	<div class="container">
  <h1>Register Form:</h1>
  <div class="card">
   <div class="card-body">
    <form action='#' th:action="@{/register}" method="POST">

     <div class="form-group row">
      <label for="fname" class="col-sm-2 col-form-label">
       FirstName</label>
      <div class="col-sm-7">
       <input type="text" class="form-control" name="fname"
        placeholder="Enter First Name">
      </div>
     </div>
     
     <div class="form-group row">
      <label for="lname" class="col-sm-2 col-form-label">
       LastName</label>
      <div class="col-sm-7">
       <input type="text" class="form-control" name="lname"
        placeholder="Enter Last Name">
      </div>
     </div>


     <div class=" form-group row">
      <label for="email" class="col-sm-2 col-form-label">Email
       </label>
      <div class="col-sm-7">
       <input type="text" class="form-control" name="email"
        placeholder="Enter Email">
      </div>
     </div>

     <div class="form-group row">
      <label for="password" class="col-sm-2 col-form-label">Password</label>
      <div class="col-sm-7">
       <input type="password" class="form-control" name="password"
        placeholder="Enter Password">
      </div>
     </div>
      
      <div class="form-group row">
      <label for="gender" class="col-sm-2 col-form-label">Gender
       </label>
      <div class="col-sm-7">
       <input type="text" class="form-control" name="gender"
        placeholder="Enter Gender">
      </div>
     </div>
     
      <div class="form-group row">
      <label for="role" class="col-sm-2 col-form-label">Role
       </label>
      <div class="col-sm-7">
       <input type="text" class="form-control" name="role"
        placeholder="Enter Role">
      </div>
     </div>

     <button type="submit" class="btn btn-success">Submit</button>
     <h3><a href="login">Login</a></h3>
    </form>
   </div>
  </div>
 </div>
 <br>
</body>
<%@ include file="../../../jsp/footer.jsp" %>
</html>