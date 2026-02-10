<%@ page language="java" contentType="text/html; charset=UTF-8"
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
<title>add-student</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body >
<%@ include file="navbar.jsp" %>


<h2 > Add Student</h2>

<form name="add-student" method="post" action="add">
Name: <input type="text" name="name"><br><br>
Email: <input type="text" name="email"><br><br>
Course: <input type="text" name="course"><br><br>
<button type="submit">Add Student</button>
</form>
</body>
</html>