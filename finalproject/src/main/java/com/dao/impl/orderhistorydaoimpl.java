package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dao.dbutil.dbconnection;
import com.dao.interfaces.orderhistorydao;
import com.dao.interfaces.ordersdao;
import com.dao.model.orderhistory;
import com.dao.model.orderitems;
import com.dao.model.orders;

public class orderhistorydaoimpl implements orderhistorydao {
	
	
	static ArrayList<orderhistory> orderitemsList=new ArrayList<orderhistory>();
	private static final String INSERTQUERY="insert into orderhistory (orderhistoryid,orderid,userid,totalamount,status,orderdate)values(?,?,?,?,?,?)";
	private static final String FETCHALL="select * from orderhistory";
	static Connection con;
	static {	
		con=dbconnection.connect();
	}
	private PreparedStatement pstmt;
	private Statement stmt;
	private ResultSet resultset;
	private ArrayList<orderhistory> orderhistoryList;
	public int insert (orderhistory orh) {
		try {
			pstmt =con.prepareStatement(INSERTQUERY);
			pstmt.setInt(1, orh.getOrderhistoryid());
			pstmt.setInt(2, orh.getOrderid());
			pstmt.setInt(3, orh.getUserid());
			pstmt.setFloat(4, orh.getTotalamount());
			pstmt.setString(5, orh.getStatus());
			pstmt.setTimestamp(6, orh.getOrderdate());
			return pstmt.executeUpdate();			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public ArrayList<orderhistory>fetchAll() {
		
		try {
			stmt = con.createStatement();
			resultset=stmt.executeQuery(FETCHALL);
			while(resultset.next()) {
				orderhistoryList.add(
						new orderhistory(
								resultset.getInt("orderhistoryid"),
								resultset.getInt("orderid"),
								resultset.getInt("userid"),
								resultset.getFloat("totalamount"),
								resultset.getString("status")
//								resultset.getTimestamp("orderdate")
								)
						);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}	
		return orderhistoryList;
}

}


