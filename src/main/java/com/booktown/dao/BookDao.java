package com.booktown.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.booktown.model.Book;
import com.booktown.util.DBConnection;

public class BookDao implements IBookDao<Book> {

	@Override
	public List<Book> findAll() {
		final List<Book> bookList = new ArrayList<>();
		Connection connection;
		try {
			connection = DBConnection.getConnection();
			final Statement statement = connection.createStatement();
			final String select = "select book_id,book_name,author,publisher,isbn,price,book_description,status,image,category_id,quantity from books";
			final ResultSet resultSet = statement.executeQuery(select);

			while (resultSet.next()) {
				Book b = new Book(
						resultSet.getInt("book_id"),
						resultSet.getString("book_name"),
						resultSet.getString("author"), 
						resultSet.getString("publisher"),
						resultSet.getString("isbn"),
						resultSet.getDouble("price"),
						resultSet.getString("book_description"),
						resultSet.getString("status"), 
						resultSet.getString("image"), 
						resultSet.getInt("category_id"),
						resultSet.getInt("quantity")
						);

				bookList.add(b);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		//System.out.println(bookList);
		return bookList;

	}

	@Override
	public List<Book> findByCategory(int id) throws SQLException {
		final List<Book> bookList = new ArrayList<>();
		Connection connection;
		try {
			connection = DBConnection.getConnection();
			
			final String select = "select book_id,book_name,author,publisher,isbn,price,book_description,status,image,category_id,quantity from books where category_id=?";
			final PreparedStatement pst = connection.prepareStatement(select);
			pst.setInt(1, id);
			final ResultSet resultSet = pst.executeQuery();

			while(resultSet.next()) {
				Book b = new Book(resultSet.getInt("book_id"), resultSet.getString("book_name"),
						resultSet.getString("author"), resultSet.getString("publisher"), resultSet.getString("isbn"),
						resultSet.getDouble("price"), resultSet.getString("book_description"),
						resultSet.getString("status"), resultSet.getString("image"), resultSet.getInt("category_id"),resultSet.getInt("quantity"));

				bookList.add(b);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		//System.out.println(bookList);
		return bookList;

	}

	
	
	
}
