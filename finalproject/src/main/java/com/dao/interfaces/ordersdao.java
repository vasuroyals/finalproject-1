package com.dao.interfaces;

import java.util.ArrayList;

import com.dao.model.orders;

public interface ordersdao {
	int insert(orders o);
	ArrayList<orders>fetchAll();

}
