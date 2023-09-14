package com.booktown.model;

import java.util.Objects;

public class User {

	private int  userid;
	private String username;
	private String firstname;
	private String lastname;
	private long contact;
	private String email;
	private String password;
	private String address;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User(int userid, String username, String firstname, String lastname, long contact, String password,
			String address) {
		super();
		this.userid = userid;
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.contact = contact;
		this.password = password;
		this.address = address;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, contact, firstname, lastname, password, userid, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(address, other.address) && contact == other.contact
				&& Objects.equals(firstname, other.firstname) && Objects.equals(lastname, other.lastname)
				&& Objects.equals(password, other.password) && userid == other.userid
				&& Objects.equals(username, other.username);
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", firstname=" + firstname + ", lastname="
				+ lastname + ", contact=" + contact + ", password=" + password + ", address=" + address + "]";
	}

	
	
		
}
