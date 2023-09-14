package com.booktown.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.booktown.dao.UserDao;
import com.booktown.model.User;


@WebServlet("/UserLoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		try {
//			final Connection connection = DBConnection.getConnection();
			String username = request.getParameter("username").trim();
			String password = request.getParameter("password").trim();
			
			System.out.println(username+"  "+password);
			UserDao userdao = new UserDao();
			HttpSession session = request.getSession();
			RequestDispatcher dispatcher = null;
			
			UserDao dao = new UserDao();

				User user = dao.login(username, password);
								
				if(user!=null)
				{
					System.out.println("1. " + user.getUserid());
					session.setAttribute("userobj", user.getUsername());
					session.setAttribute("userid", user.getUserid());
					dispatcher = request.getRequestDispatcher("index.jsp");
					dispatcher.forward(request, response);
					
					System.out.println(session.getAttribute("userobj"));
					
				}
				else {
					
					session.setAttribute("failedMessage", "Email & Password Invalid!");
					response.sendRedirect("loginandregister.jsp");
				}
				
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
