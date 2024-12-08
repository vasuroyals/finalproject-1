package com.dao.interfaces;

import java.util.ArrayList;


import com.dao.model.user;

public interface userdao {
		
	int insert(user u);
	ArrayList<user> fetchAll();
	
}
