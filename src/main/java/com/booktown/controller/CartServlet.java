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
 * Servlet implementation class CartServlet
 */
@WebServlet("/cart")
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int bid = Integer.parseInt(req.getParameter("bid"));
		int uid	= Integer.parseInt(req.getParameter("uid"));
		String bname =  req.getParameter("bname");
		String author =req.getParameter("author");
		double price = Double.parseDouble(req.getParameter("price"));
		int quantity =1;
		double totalPrice = quantity*price; 
		
		CartDao cartDao = new CartDao();
		boolean f = cartDao.addCart(new Cart(bid,uid,bname,author,price,totalPrice));
		if(f) {
			System.out.println("1");
			resp.sendRedirect("index.jsp");
		}else {
			System.out.println("2");
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
