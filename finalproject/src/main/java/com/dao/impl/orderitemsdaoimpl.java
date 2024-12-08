package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.dao.dbutil.dbconnection;
import com.dao.interfaces.orderitemsdao;

import com.dao.model.orderitems;

public class orderitemsdaoimpl implements orderitemsdao {
	
	
	static ArrayList<orderitems> orderitemsList=new ArrayList<orderitems>();
	private static final String INSERTQUERY="insert into orderitems (orderitemid,orderid,menuid,quantity,itemtotal)values(?,?,?,?,?)";
	private static final String FETCHALL="select * from orderitems";
	static Connection con;
	
	static {
		
		con=dbconnection.connect();
	}
	private PreparedStatement pstmt;
	private Statement stmt;
	private ResultSet resultset;
	public int insert (orderitems or) {
		try {
			pstmt =con.prepareStatement(INSERTQUERY);
			pstmt.setInt(1,or.getOrderitemid());
			pstmt.setInt(2, or.getOrderid());
			pstmt.setInt(3, or.getMenuid());
			pstmt.setInt(4, or.getQuantity());
			pstmt.setInt(5, or.getItemtotal());
			
			return pstmt.executeUpdate();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public ArrayList<orderitems>fetchAll1() {
		
		try {
			
			stmt = con.createStatement();
			resultset=stmt.executeQuery(FETCHALL);
			while(resultset.next()) {
				orderitemsList.add(
						new orderitems(
								resultset.getInt("orderitemid"),
								resultset.getInt("orderid"),
								resultset.getInt("menuid"),
								resultset.getInt("quantity"),
								resultset.getInt("itemtotal")
								)
						);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return orderitemsList;
	}

	@Override
	public ArrayList<orderitems> fetchAll() {
		// TODO Auto-generated method stub
		return orderitemsList;
	}


}
