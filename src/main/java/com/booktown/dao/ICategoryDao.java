package com.booktown.dao;

import java.util.List;

public interface ICategoryDao<T> {

	List<T> findAll();
	T findByCategoryId(int id);
}
