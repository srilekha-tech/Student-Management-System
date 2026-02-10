<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Student Management--Home</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
		
	</head>
	<body>
	<%@ include file="navbar.jsp" %>
	
		<h1>Student Management System</h1>
		<hr>
		<h3>Welcome</h3>
		<p>Choose an Action:</p>
		<ul>
			<li> <a href = "add-student.jsp">Add Student</a></li>
			<li> <a href = "view-student.jsp">View Students</a></li>
			
		</ul>
		 <button><a href="logout.jsp">Logout</a></button>
	</body>
</html>