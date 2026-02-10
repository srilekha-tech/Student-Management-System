<%@ page import="com.app1.model.Students" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<title>edit page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

</head>

<body>
<%@ include file="navbar.jsp" %>

 <%
    	Students s= (Students) request.getAttribute("student");
%>
<h2>Edit Student</h2>

<form action="update" method="post">

<input type="hidden" name="id" value="<%= s.getId() %>">

Name: <input type="text" name="name" value="<%= s.getName() %>"> <br><br>
Email: <input type="text" name="email" value="<%= s.getEmail() %>"> <br><br>
Course: <input type="text" name="course" value="<%= s.getCourse() %>"> <br><br>
<button type="submit">Update Student</button>

</form>
</body>
</html>