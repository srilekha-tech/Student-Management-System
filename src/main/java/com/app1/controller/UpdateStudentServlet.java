package com.app1.controller;

import jakarta.servlet.ServletException;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.app1.dao.StudentsDAO;
import com.app1.model.Students;

@WebServlet("/update")
public class UpdateStudentServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String course=request.getParameter("course");
		
		Students s=new Students(id,name,email,course);
		int result= StudentsDAO.updateStudent(s);
		
		if(result>0) {
			response.getWriter().println("student updated successfuly");
		}else {
			response.getWriter().println("failed to update student");
		}
	}

}
