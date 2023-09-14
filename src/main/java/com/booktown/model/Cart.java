package com.booktown.model;

public class Cart {
	
	private int cartid;
	private int bookid;
	private int userid;
	private String bookname;
	private String author;
	private double price;
	private double totalprice;
	
	
	public Cart(int bookid, int userid, String bookname, String author, double price, double totalprice) {
		super();
		this.bookid = bookid;
		this.userid = userid;
		this.bookname = bookname;
		this.author = author;
		this.price = price;
		this.totalprice = totalprice;
	}

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(int cartid, int bookid, int userid, String bookname, String author, double price, double totalprice) {
		super();
		this.cartid = cartid;
		this.bookid = bookid;
		this.userid = userid;
		this.bookname = bookname;
		this.author = author;
		this.price = price;
		this.totalprice = totalprice;
	}

	public int getCartid() {
		return cartid;
	}

	public void setCartid(int cartid) {
		this.cartid = cartid;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}

	@Override
	public String toString() {
		return "Cart [cartid=" + cartid + ", bookid=" + bookid + ", userid=" + userid + ", bookname=" + bookname
				+ ", author=" + author + ", price=" + price + ", totalprice=" + totalprice + "]";
	}
	
	
	
	

}
