package com.booktown.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.booktown.model.User;
import com.booktown.util.DBConnection;

public class UserDao implements IUserDao<User> {
	

	public UserDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean registration(User user) {
		boolean value = false;
		
		try {
			final Connection connection = DBConnection.getConnection();
			
			String query = "insert into users(username,first_name,last_name,contact,email,password,address) values(?,?,?,?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1,user.getUsername());
			ps.setString(2, user.getFirstname());
			ps.setString(3, user.getLastname());
			ps.setLong(4, user.getContact());
			ps.setString(5, user.getEmail());
			ps.setString(6,user.getPassword());
			ps.setString(7,user.getAddress());
			
			//System.out.println(user.getUsername());
			
			ResultSet rs = ps.executeQuery();
			boolean i = rs.next();
			if(i)
			{	
				value=true;
			}
			return value;
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public User login(String username, String password) {
		
		User user = null;
		try {
			final Connection connection = DBConnection.getConnection();
			String query = "select * from users where username=? and password=?";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1,username);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			
			
			while(rs.next())
			{
				user = new User();
				user.setUserid(rs.getInt(1));
				user.setUsername(rs.getString(2));
				user.setFirstname(rs.getString(3));
				user.setLastname(rs.getString(4));
				user.setContact(rs.getLong(5));
				user.setPassword(rs.getString(6));
				user.setAddress(rs.getString(7));
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return user;
	}

	

}
