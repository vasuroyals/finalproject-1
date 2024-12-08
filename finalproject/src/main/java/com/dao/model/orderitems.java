package com.dao.model;

public class orderitems {
	private int orderitemid;
	private int orderid;
	private int menuid;
	private int quantity;
	private int itemtotal;
	public int getOrderitemid() {
		return orderitemid;
	}
	public void setOrderitemid(int orderitemid) {
		this.orderitemid = orderitemid;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getMenuid() {
		return menuid;
	}
	public void setMenuid(int menuid) {
		this.menuid = menuid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getItemtotal() {
		return itemtotal;
	}
	public void setItemtotal(int itemtotal) {
		this.itemtotal = itemtotal;
	}
	public orderitems(int orderitemid, int orderid, int menuid, int quantity, int itemtotal) {
		this.orderitemid = orderitemid;
		this.orderid = orderid;
		this.menuid = menuid;
		this.quantity = quantity;
		this.itemtotal = itemtotal;
	}
	@Override
	public String toString() {
		return orderitemid + " " + orderid + " " + menuid + " "
				+ quantity + " " + itemtotal;
	}
}
