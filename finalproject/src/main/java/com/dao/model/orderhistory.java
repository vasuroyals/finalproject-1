package com.dao.model;

import java.sql.Time;
import java.sql.Timestamp;

public class orderhistory {
	
	private int orderhistoryid;
	private int orderid;
	private int userid;
	private float totalamount;
	private String status;
	private Timestamp orderdate;
	public int getOrderhistoryid() {
		return orderhistoryid;
	}
	public void setOrderhistoryid(int orderhistoryid) {
		this.orderhistoryid = orderhistoryid;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public float getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(float totalamount) {
		this.totalamount = totalamount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Timestamp getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(Timestamp orderdate) {
		this.orderdate = orderdate;
	}
	public orderhistory(int orderhistoryid, int orderid, int userid, float totalamount, String status) {
		this.orderhistoryid = orderhistoryid;
		this.orderid = orderid;
		this.userid = userid;
		this.totalamount = totalamount;
		this.status = status;
		this.orderdate = orderdate;
	}
@Override
	public String toString() {
		return orderhistoryid + " " + orderid + " " + userid
				+ " " + totalamount + " " + status + " " + orderdate;
	}
}
