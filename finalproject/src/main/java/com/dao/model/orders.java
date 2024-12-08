package com.dao.model;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.print.attribute.DateTimeSyntax;

public class orders {
	private int orderid;
	private int userid;
	private int restaurentid;
	private String ordaerdate;
	private float totalamount;
	private String status;
	private String paymentmode;
	public orders(int int1, int int2, int int3,float float1, String string, String string2) {
		// TODO Auto-generated constructor stub
	}
	public orders() {
		// TODO Auto-generated constructor stub
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
	public int getRestaurentid() {
		return restaurentid;
	}
	public void setRestaurentid(int restaurentid) {
		this.restaurentid = restaurentid;
	}
	public String getOrdaerdate() {
		return ordaerdate;
	}
	public void setOrdaerdate(String ordaerdate) {
		this.ordaerdate = ordaerdate;
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
	public String getPaymentmode() {
		return paymentmode;
	}
	public void setPaymentmode(String paymentmode) {
		this.paymentmode = paymentmode;
	}
	
	
	@Override
	public String toString() {
		return  orderid + " " + userid + " " + restaurentid + " "
				+ ordaerdate + " " + totalamount + " " + status + " " + paymentmode;
	}
	
	

}
