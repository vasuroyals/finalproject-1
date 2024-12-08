package com.dao.main;

import java.sql.Timestamp;
import java.util.ArrayList;

import com.dao.impl.ordersdaoimpl;
import com.dao.interfaces.ordersdao;
import com.dao.model.orders;

public class ordersmain {	
private static ordersdaoimpl oda;
private static Timestamp d;
public static <oda> void main(String[] args) {
		
		

		ordersdao oda =new ordersdaoimpl();
		ArrayList<orders> olist=oda.fetchAll();
		for(orders o : oda.fetchAll()) {
			System.out.println(o);
		}
		
		orders o=new orders(1,1,1,55,"yes completed","online");
		int x=oda.insert(o);
		if(x==0) {
			System.out.println("data is not inserted with status"+x);
		}
		else {
			System.out.println("data is inserted with status "+x);
		}

	}

}
