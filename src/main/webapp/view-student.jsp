<%@ page import="java.util.*,com.app1.model.Students,com.app1.dao.StudentsDAO" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%
    if(session.getAttribute("admin") == null){
        response.sendRedirect("admin-login.jsp");
        return;
    }
%>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>view students</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
		
	</head>
	<body>
		<%@ include file="navbar.jsp" %>
		
		<div class="container mt-4">
		
		<h2 class="text-center mb-4">All Students</h2>
		<% List<Students> list=StudentsDAO.getAllStudents(); %>
		<table class="table table-bordered table-striped" border="1" cellpadding="8">
		<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Email</th>
		<th>Course</th>
		<!-- for delete -->
		<th>Action</th>
		<th>Edit</th>
		</tr>
		<%
		for(Students s:list){
		%>
		<tr class="table-dark">
		<td><%= s.getId() %></td>
		<td><%= s.getName() %></td>
		<td><%= s.getEmail() %></td>
		<td><%= s.getCourse() %></td>
		<!-- delete link -->
		<td> <a href="delete?id=<%= s.getId() %>"> Delete</a> </td>
		<!-- edit link -->
		<td> <a href="edit?id=<%= s.getId() %>">Edit</a> </td>
		</tr>
		<%
		}
		%>
		</table>
		<br>
		<a href="add-student.jsp" class="btn btn-primary mt-3">Add Student</a>
		</div>
	</body>
</html>