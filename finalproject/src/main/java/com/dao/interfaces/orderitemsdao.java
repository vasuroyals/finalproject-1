package com.dao.interfaces;
import java.util.ArrayList;
import com.dao.model.orderitems;
public interface orderitemsdao {
	int insert(orderitems o);
	ArrayList<orderitems>fetchAll();
}
