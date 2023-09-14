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


@WebServlet("/UserRegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String username = request.getParameter("username").trim();
			String firstname = request.getParameter("firstname").trim();
			String lastname = request.getParameter("lastname").trim();
			String contact = request.getParameter("contact");
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			String address = request.getParameter("address");
			
			
			
			//System.out.println(username+" "+firstname+" "+lastname+" "+contact+" " + email+ " " + password+" "+address);
			User user = new User();
			user.setUsername(username);
			user.setFirstname(firstname);
			user.setLastname(lastname);
			user.setContact(Long.parseLong(contact));
			user.setEmail(email);
			user.setPassword(password);
			user.setAddress(address);
			
			HttpSession session = request.getSession();
			
			UserDao userdao = new UserDao();
			boolean result = userdao.registration(user);
			
			if(result)
			{
				System.out.println("PAssed");
				session.setAttribute("successMessage", "Registration Successful");
				response.sendRedirect("loginandregister.jsp");
				//System.out.println("user register successful!");
				RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
				rd.forward(request, response);
			}
			else {
				System.out.println("PAssed");
				session.setAttribute("failMessage","Something Went Wrong on Server!");
				response.sendRedirect("loginandregister.jsp");;
				RequestDispatcher rd = request.getRequestDispatcher("loginandregister.jsp");
				rd.include(request, response);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
