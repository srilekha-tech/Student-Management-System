package com.app1.controller;

import java.io.IOException;


import com.app1.dao.StudentsDAO;
import com.app1.model.Students;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/add")
public class AddStudentServlet extends HttpServlet {

    //no-arg constructor
    public AddStudentServlet() {
    }

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name= request.getParameter("name");
		String email=request.getParameter("email");
		String course= request.getParameter("course");
		
		//validations
		if(name == null || name.trim().isEmpty() ||
				   email == null || email.trim().isEmpty() ||
				   course == null || course.trim().isEmpty()) {

				    response.getWriter().println("All fields are required!");
				    return; // stop execution
				}
		
		Students s=new Students( name,email,course);
		
		int result = StudentsDAO.addStudent(s);
		
		if(result>0) {
			response.getWriter().println("Student added Successfully");
			}else {
				response.getWriter().println("failed to add student");
			}
	}

}
