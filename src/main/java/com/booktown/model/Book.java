package com.booktown.model;

import java.util.Objects;

public class Book {

	private int bookid;
	private String bookname;
	private String author;
	private String publisher;
	private String isbn;
	private double price;
	private String description;
	private String status;
	private String image;
	private int categoryid;
	private int quantity;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Book(int bookid, String bookname, String author, String publisher, String isbn, double price,
			String description, String status, String image, int categoryid, int quantity) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.author = author;
		this.publisher = publisher;
		this.isbn = isbn;
		this.price = price;
		this.description = description;
		this.status = status;
		this.image = image;
		this.categoryid = categoryid;
		this.quantity = quantity;
	}



	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
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

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, bookid, bookname, categoryid, description, image, isbn, price, publisher, status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && bookid == other.bookid
				&& Objects.equals(bookname, other.bookname) && categoryid == other.categoryid
				&& Objects.equals(description, other.description) && Objects.equals(image, other.image)
				&& Objects.equals(isbn, other.isbn)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(publisher, other.publisher) && Objects.equals(status, other.status);
	}

	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", author=" + author + ", publisher=" + publisher
				+ ", isbn=" + isbn + ", price=" + price + ", description=" + description + ", status=" + status
				+ ", image=" + image + ", categoryid=" + categoryid + "]";
	}

	
	
	
	
	
}
