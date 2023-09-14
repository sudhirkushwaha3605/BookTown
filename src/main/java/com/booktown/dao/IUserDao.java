package com.booktown.dao;

import java.util.List;

import com.booktown.model.User;

public interface IUserDao<T> {
	List<T> findAll();
	public boolean registration(User user);
	public T login(String username,String password); 
}
