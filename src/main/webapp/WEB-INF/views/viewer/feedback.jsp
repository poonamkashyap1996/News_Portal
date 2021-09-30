<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeLeaf.org">
<head>
<link rel="stylesheet" href="../css/bootstrap.min.css">         
<script src="../js/bootstrap.min.js"></script>   

<meta charset="ISO-8859-1">
<title>Feedback</title>
</head>
<%@ include file="../../../jsp/headerviewer.jsp" %>
<body>
<h5 align="center" style="color:green;">${message}</h5>
	<table style="width: 100%">
		<tr>
		<th align="left"><a href="welcome">Back</a></th>
					
		</tr>		
	</table>
	<div class="container">
  <h1>Feedback Form:</h1>
  <div class="card">
   <div class="card-body">
    <form action='#' th:action="@{/feedback}" method="POST">

     <div class="form-group row">
      <label for="feedbacktype" class="col-sm-3 col-form-label">
       SUGGESTION/COMPLAINT</label>
      <div class="col-sm-7">
       <input type="text" class="form-control" name="feedbacktype"
        placeholder="Enter FeedBack Type">
      </div>
     </div>
     
     <div class="form-group row">
      <label for="title" class="col-sm-3 col-form-label">
       Title</label>
      <div class="col-sm-7">
       <input type="text" class="form-control" name="title"
        placeholder="Enter Title">
      </div>
     </div>


     <div class=" form-group row">
      <label for="description" class="col-sm-3 col-form-label">Description
       </label>
      <div class="col-sm-7">
       <input type="text" class="form-control" name="description"
        placeholder="Enter Description">
      </div>
     </div>

     <div class="form-group row">
      <label for="date" class="col-sm-3 col-form-label">Date</label>
      <div class="col-sm-7">
       <input type="date" class="form-control" name="date"
        placeholder="Enter Date">
      </div>
     </div>
      
      


     <button type="submit" class="btn btn-success">Submit</button>
    
    </form>
   </div>
  </div>
</div>
 <br>
</body>
<%@ include file="../../../jsp/footer.jsp" %>
</html>