package com.dao.interfaces;

import java.util.ArrayList;

import com.dao.model.restaurent;

public interface restaurentdao {
	int insert(restaurent r);
	ArrayList<restaurent> fetchAll();

}
