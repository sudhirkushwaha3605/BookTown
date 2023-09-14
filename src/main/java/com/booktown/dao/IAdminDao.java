package com.booktown.dao;

public interface IAdminDao<T> {
	T findAdmin(String username,String password);

}
