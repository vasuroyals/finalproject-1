package com.dao.main;

import java.util.ArrayList;

import com.dao.impl.restaurentdaoimpl;
import com.dao.impl.userdaoimpl;
import com.dao.interfaces.userdao;
import com.dao.model.restaurent;
import com.dao.model.user;

public class restaurentmain {
	
	private static restaurent r;

	public static void main(String[] args) {
	restaurentdaoimpl rda =new restaurentdaoimpl();
	for(restaurent r : rda.fetchAll()) {
		System.out.println(r);
	}

	ArrayList<restaurent> rlist= rda.fetchAll();
	restaurent r =new restaurent(2,"kailsasam","family",1,"banglore btm layout", (float) 3.5, true,"yes");
	int x=rda.insert(r);
	if(x==0) {
		System.out.println("data is not inserted with status"+x);
	}
	else {
		System.out.println("data is inserted with status "+x);
	}

}
}