package com.dao.main;

import java.util.ArrayList;
import com.dao.impl.orderitemsdaoimpl;
import com.dao.interfaces.ordersdao;
import com.dao.model.orderitems;

public class orderitemsmain {
	private static orderitems osr;

	public static void main(String[] args) {
		orderitemsdaoimpl orda =new orderitemsdaoimpl();
		for(orderitems or : orda.fetchAll()) {
			System.out.println(or);
		}
		ArrayList<orderitems> orlist= orda.fetchAll();
		orderitems osr =new orderitems(1,1,1,2,2);
			int x=orda.insert(osr);
		if(x==0) {
			System.out.println("data is not inserted with status"+x);
		}
		else {
			System.out.println("data is inserted with status "+x);
		}

	}

}
