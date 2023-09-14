package com.booktown.dao;

import java.sql.SQLException;
import java.util.List;



public interface IBookDao<T> {

	List<T> findAll()throws SQLException;
	List<T> findByCategory(int id)throws SQLException;
	
	
	
}
