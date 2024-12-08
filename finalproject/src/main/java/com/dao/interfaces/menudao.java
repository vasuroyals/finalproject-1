package com.dao.interfaces;

import java.util.ArrayList;

import com.dao.model.menu;

public interface menudao {
	int insert(menu m);
	ArrayList<menu> fetchAll();

}
