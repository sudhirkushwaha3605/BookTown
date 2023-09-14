package com.booktown.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.booktown.model.Categories;
import com.booktown.util.DBConnection;

public class CategoriesDao implements ICategoryDao<Categories> {

	Connection connection;
	
	@Override
	public List<Categories> findAll() {

		final List<Categories> categoryList = new ArrayList<>();
		
		try {
			connection = DBConnection.getConnection();
			final Statement statement = connection.createStatement();
			final String select = "select category_id,category_name from categories";
			final ResultSet resultSet = statement.executeQuery(select);

			while (resultSet.next()) {
				Categories c = new Categories(resultSet.getInt("category_id"),
						resultSet.getString("category_name"));

				categoryList.add(c);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// System.out.println(categoryList);
		return categoryList;
	}

	@Override
	public Categories findByCategoryId(int id) {
		
		Categories cate = null;
		int nid=id;
		try {
			connection = DBConnection.getConnection();
			String query = "Select category_name from categories where category_id=?";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, nid);
			
			
			ResultSet rs = ps.executeQuery();
			
			//System.out.println(rs);
			
			while (rs.next()) {
				Categories c = new Categories(
							rs.getInt("category_id"),
							rs.getString("category_name")
						);				
			}
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return cate;
	}

}
