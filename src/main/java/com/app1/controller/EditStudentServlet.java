package com.app1.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.app1.dao.StudentsDAO;
import com.app1.model.Students;


@WebServlet("/edit")
public class EditStudentServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id =Integer.parseInt(request.getParameter("id"));
		
		Students s= StudentsDAO.getStudentById(id);
		
		request.setAttribute("student", s);
		
		request.getRequestDispatcher("edit-student.jsp").forward(request, response);
		
	}
}
