package com.booktown.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.booktown.model.Cart;
import com.booktown.util.DBConnection;

public class CartDao implements ICartDao<Cart> {

	

	@Override
	public boolean addCart(Cart c) {
		boolean f = false;
		try {
			Connection connection = DBConnection.getConnection();
			String query = "insert into cart(book_id,user_id,book_name,author,price,total_price) values(?,?,?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, c.getBookid());
			ps.setInt(2, c.getUserid());
			ps.setString(3, c.getBookname());
			ps.setString(4, c.getAuthor());
			ps.setDouble(5, c.getPrice());
			ps.setDouble(6, c.getTotalprice());

			int i = ps.executeUpdate();
			System.out.println("i am " + i);
			if (i == 1) {
				f = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;

	}

	
	@Override
	public List<Cart> findAll() {
		List<Cart> cartList = new ArrayList<>();
		try {
			Connection connection = DBConnection.getConnection();
			String query = "select * from cart";
			PreparedStatement ps = connection.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				Cart c = new Cart(
						rs.getInt(1),
						rs.getInt(2),
						rs.getInt(3),
						rs.getString(4),
						rs.getString(5),
						rs.getDouble(6),
						rs.getDouble(7));
				
				cartList.add(c);
				
			}
			
			System.out.println(cartList);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return cartList;
	}

	
	
	@Override
	public List<Cart> getBookByUser(int userId) {

		List<Cart> list = new ArrayList<>();
//		Cart c = null;
//		double totalPrice = 0;
//		try {
//			String sql = "select * from cart where uid=?";
//		
//			PreparedStatement ps = connection.prepareStatement(sql);
//			ps.setInt(1, userId);
//			ResultSet rs = ps.executeQuery();
//
//			while (rs.next()) {
//				c = new Cart();
//
//				c.setBookid(userId);
//
//				totalPrice = totalPrice + rs.getDouble(7);
//				c.setPrice(totalPrice);
//				list.add(c);
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		return list;
	}
	
	
	@Override
	public int removeCartItems(int product_id,int customer_id) {
		int i=0;
		try
		{
			Cart cart = null;
			Connection connection = DBConnection.getConnection();
			String query = "delete from cart where book_id=? and user_id=?";
			PreparedStatement pst = connection.prepareStatement(query);
			pst.setInt(1, product_id);
			pst.setInt(2,customer_id);
			i = pst.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return i;
	}

	@Override
	public boolean deleteBook(int bookid, int userid, int cartid) {
		boolean f = false;
//		try {
//			String sql = "delete from cart where book_id=?";
//			PreparedStatement ps = connection.prepareStatement(sql);
//			ps.setInt(1, bookid);
//
//			int i = ps.executeUpdate();
//			if (i == 1) {
//				f = true;
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//
//		}
		return f;
	}

}
