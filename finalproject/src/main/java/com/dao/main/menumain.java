package com.dao.main;

import java.util.ArrayList;

import com.dao.impl.menudaoimpl;
import com.dao.interfaces.menudao;
import com.dao.model.menu;

public class menumain {
	private static boolean yes;

	public static void main(String[] args) {
	
	menudao mda =new menudaoimpl();

	for(menu m : mda.fetchAll())	 {
		System.out.println(m);
	}
	
	
	ArrayList<menu> mlist=mda.fetchAll();
	
	menu m=new menu(1,1,"kailasam","good restaurent",100,yes,"image");
	int x=mda.insert(m);
	if(x==0) {
		System.out.println("data is not inserted with status"+x);
	}
	else {
		System.out.println("data is inserted with status "+x);
}

}
}

