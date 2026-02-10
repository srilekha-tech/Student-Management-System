<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container">
    <a class="navbar-brand" href="index.jsp">Student App</a>

    <div >
      <ul class="navbar-nav ms-auto">

        <li class="nav-item">
          <a class="nav-link" href="add-student.jsp">Add Student</a>
        </li>

        <li class="nav-item">
          <a class="nav-link" href="view-student.jsp">View Students</a>
        </li>

        <li class="nav-item">
          <a class="nav-link text-danger fw-bold" href="logout.jsp">Logout</a>
        </li>

      </ul>
    </div>
  </div>
</nav>

</body>
</html>