package com.booktown.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.booktown.dao.CartDao;
import com.booktown.model.Cart;

/**
 * Servlet implementation class RemoveCartItemServlet
 */
@WebServlet("/RemoveCartItemServlet")
public class RemoveCartItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RemoveCartItemServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int bookid = Integer.parseInt(request.getParameter("bid"));
		int userid	= Integer.parseInt(request.getParameter("uid"));
		CartDao cdao = new CartDao();
		Cart cart = new Cart();
		int a = cdao.removeCartItems(bookid,userid);
		if(a>0)
		{
			response.sendRedirect("cart.jsp");
			System.out.println("removed");
			
		}
		else
		{
			System.out.println("Not null");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
