package com.booktown.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.booktown.dao.AdminDao;
import com.booktown.model.Admin;


@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		AdminDao admindao = new AdminDao();
		Admin admin= admindao.findAdmin(username, password);
		HttpSession  session = request.getSession();
		
		if(admin!=null)
		{
			session.setAttribute("admin", username);
			System.out.println("passed");
			response.sendRedirect("admindashboard.jsp");
		}
		else
		{
			System.out.println("failed");
		}
	}

}
