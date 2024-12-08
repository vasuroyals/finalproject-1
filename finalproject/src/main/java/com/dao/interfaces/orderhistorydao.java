package com.dao.interfaces;

import java.util.ArrayList;

import com.dao.model.orderhistory;


public interface orderhistorydao {
	int insert(orderhistory orh);
	ArrayList<orderhistory>fetchAll();

}
