package com.booktown.dao;

import java.util.List;

import com.booktown.model.Cart;

public interface ICartDao<T> {

	
		 public boolean addCart(Cart c);
		 List<T> findAll();
		 public List<T> getBookByUser(int userId);
		 public boolean deleteBook(int bid,int user_id ,int cid);
		 public int removeCartItems(int product_id,int customer_id);
		
}

