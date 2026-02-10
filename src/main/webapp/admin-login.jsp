<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Admin login</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
		
	</head>
	<body>
		
		
		<div class="container d-flex justify-content-center align-items-center" style="height: 80vh;">
			<form name="admin-login" method="post" action="AdminLoginServlet">
				<h2>Student Management System</h2>
				<br>
				<h5 style="text-align:center"><u>Admin login</u></h5>
				<br>
				Username: <input type="text" name="username"><br><br>
				Password: <input type="text" name="password"><br><br>
				 
				<button type="submit">Login</button>
			</form>
		</div>
		
	</body>
</html>