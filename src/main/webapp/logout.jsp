<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>logout page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
<%@ include file="navbar.jsp" %>


<%
    session.invalidate();
    response.sendRedirect("admin-login.jsp");
%>
<a href="logout.jsp">Logout</a>

</body>
</html>