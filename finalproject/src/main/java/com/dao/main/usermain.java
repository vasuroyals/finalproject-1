package com.dao.main;

import java.util.ArrayList;

import com.dao.impl.userdaoimpl;
import com.dao.interfaces.userdao;
import com.dao.model.user;

public class usermain {

	public static void main(String[] args) {
		
		

		userdao uda =new userdaoimpl();
		ArrayList<user> ulist=uda.fetchAll();
		for(user u : uda.fetchAll()) {
			System.out.println(u);
		}
		
		user u=new user(3,"vasu","1234","vasu@gmail.com","banglore btm layout");
		int x=uda.insert(u);
		if(x==0) {
			System.out.println("data is not inserted with status"+x);
		}
		else {
			System.out.println("data is inserted with status"+x);
		}

	}

}
