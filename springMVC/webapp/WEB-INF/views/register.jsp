<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false"%>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" 
    integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>
<body>
	<div class="container">
		<div class="row">
		 	<div class="col-md-6">
		 		<form action="addData" method="post">
		 		<div class="mb-3">
    					<label for="exampleInputEmail1" class="form-label">Name</label>
    					<input type="text" name="name" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
  					</div>
  					<div class="mb-3">
    					<label for="exampleInputEmail1" class="form-label">Mobile Number</label>
    					<input type="number" name="number" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
  					</div>
  					<div class="mb-3">
    					<label for="exampleInputEmail1" class="form-label">Email address</label>
    					<input type="email" name="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
  					</div>
  					<div class="mb-3">
    					<label for="exampleInputPassword1" class="form-label">Password</label>
    					<input type="password" name="pwd" class="form-control" id="exampleInputPassword1">
 					 </div>
 					 <button type="submit" class="btn btn-primary">Submit</button>
				</form>
		 	</div>
		 </div>
	</div>
</body>
</html>