package com.app1.controller;

import java.io.IOException;

import com.app1.dao.StudentsDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class DeleteStudentServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id =Integer.parseInt( request.getParameter("id"));
		int result = StudentsDAO.deleteStudent(id);
		
		if(result > 0) {
            response.getWriter().println("Student deleted successfully!");
        } else {
            response.getWriter().println("Failed to delete student.");
        }
	}


}
