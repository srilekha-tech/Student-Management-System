package com.app1.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AdminLoginServlet() {
        super();
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password =request.getParameter("password");
		
		if(username.equals("admin") && password.equals("admin123")) {

            HttpSession session = request.getSession();
            session.setAttribute("admin", username);

            response.sendRedirect("index.jsp");   // redirect to home or view page
        } else {
            response.getWriter().println("Invalid username or password");
        }
		
	}

}
