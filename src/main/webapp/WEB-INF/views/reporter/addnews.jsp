<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeLeaf.org">
<head>
<link rel="stylesheet" href="../css/bootstrap.min.css">         
<script src="../js/bootstrap.min.js"></script>   

<meta charset="UTF-8">
<title>Add News</title>
</head>
<%@ include file="../../../jsp/headerreporter.jsp" %>
<body>
<table style="width: 100%">
		<tr>
		<th align="left"><a href="welcome">Back</a></th>
						
		</tr>		
	</table>
	
	<div class="container">
<h3 align="center">Add News</h3>
 <form action="#" th:action="@{/addnews}" method="POST">

     <div class="form-group row">
      <label for="category" class="col-sm-2 col-form-label">
       Category</label>
      <div class="col-sm-7">
       <input type="text" class="form-control" name="category"
        placeholder="Enter Category">
      </div>
     </div>
     
     <div class="form-group row">
      <label for="title" class="col-sm-2 col-form-label">
       Title</label>
      <div class="col-sm-7">
       <input type="text" class="form-control" name="title"
        placeholder="Enter Title">
      </div>
     </div>
     
      <div class=" form-group row">
      <label for="description" class="col-sm-2 col-form-label">Description
       </label>
      <div class="col-sm-7">
       <input type="text" class="form-control" name="description"
        placeholder="Enter Description">
      </div>
     </div>
     


     <div class=" form-group row">
      <label for="content" class="col-sm-2 col-form-label">Content
       </label>
      <div class="col-sm-7">
       <input type="text" class="form-control" name="content"
        placeholder="Enter Content">
      </div>
     </div>

     <div class="form-group row">
      <label for="date" class="col-sm-2 col-form-label">Date</label>
      <div class="col-sm-7">
       <input type="date"  name="date">
      </div>
     </div>
      
      
      
      <div class="form-group row">
      <label for="editor_name" class="col-sm-2 col-form-label">Editor Name
       </label>
      <div class="col-sm-7">
       <input type="text" class="form-control" name="editor_name"
        placeholder="Enter Your Name">
      </div>
     </div>
      

     <button type="submit" class="btn btn-success">Submit</button>
    </form>
    </div>
    <br>
</body>
<%@ include file="../../../jsp/footer.jsp" %>
</html>