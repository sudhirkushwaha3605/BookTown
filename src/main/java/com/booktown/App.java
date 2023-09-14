package com.booktown;

import java.util.List;

import com.booktown.dao.CartDao;
import com.booktown.model.Cart;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CartDao dao = new CartDao();
		List<Cart> cartList = dao.findAll();
		
		for(Cart c:cartList) {
			System.out.println(c.toString());
		}
	}

}
