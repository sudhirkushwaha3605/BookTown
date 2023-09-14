package com.booktown.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.booktown.model.Admin;
import com.booktown.util.DBConnection;

public class AdminDao implements IAdminDao<Admin> {

	@Override
	public Admin findAdmin(String username, String password) {
		Admin admin = null;
		Connection connection;
		
		try
		{
			connection = DBConnection.getConnection();
			String query= "select * from admin where username=? and password=?";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				admin = new Admin(
							rs.getString("username"),
							rs.getString("password")
						);
				
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return admin;
		
	}

}
