package com.dao.main;

import java.util.ArrayList;

import com.dao.impl.orderhistorydaoimpl;
import com.dao.interfaces.orderhistorydao;
import com.dao.model.orderhistory;
public class orderhistorymain {
	private static Object orderhistory;
	public static void main(String[] args) {
		orderhistorydao ooda =new orderhistorydaoimpl();
		ArrayList<orderhistory> olist=ooda.fetchAll();
		for(orderhistory orh : ooda.fetchAll()) {
			System.out.println(orh);
		}
		orderhistory orh=new orderhistory(1,1,1,500,"delivered");
		int x=ooda.insert(orh);
		if(x==0) {
			System.out.println("data is not inserted with status"+x);
		}
		else {
			System.out.println("data is inserted with status "+x);
		}
	}
}

