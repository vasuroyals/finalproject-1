package com.dao.model;

public class user {
	private int userid;
	private String username;
	private String passwrod;
	private String email;
	private String address;
	private String creatdate;
	private String lastlogin;
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
	public String getPasswrod() {
		return passwrod;
	}
	public void setPasswrod(String passwrod) {
		this.passwrod = passwrod;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCreatedate() {
		return creatdate;
	}
	public void setCreatedate(String createdate) {
		this.creatdate = createdate;
	}
	public user() {
	
	}
	public user(int userid, String username, String passwrod, String email, String address) {
		super();
		this.userid = userid;
		this.username = username;
		this.passwrod = passwrod;
		this.email = email;
		this.address = address;
		this.creatdate = creatdate;
		this.lastlogin = lastlogin;
	}
	@Override
	public String toString() {
		return userid + " " + username + " " + passwrod + " " + email
				+ " " + address + " " + creatdate + " " + lastlogin;
	}
	
	
	
	
}
