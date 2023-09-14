package com.booktown.model;

public class Categories {
	private int categoryid;
	private String categoryname;
	
	public Categories() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categories(int categoryid, String categoryname) {
		super();
		this.categoryid = categoryid;
		this.categoryname = categoryname;
	}

	public int getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}

	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	@Override
	public String toString() {
		return "Categories [categoryid=" + categoryid + ", categoryname=" + categoryname + "]";
	}
	
	
	
}
