package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.dao.dbutil.dbconnection;
import com.dao.interfaces.ordersdao;
import com.dao.model.orders;

public class ordersdaoimpl implements ordersdao {
	
	static ArrayList<orders> ordersList=new ArrayList<orders>();
	private static final String INSERTQUERY="insert into orders (orderid,userid,restaurentid,orderdate,total_amount,status,paymentmode)values(?,?,?,?,?,?,?)";
	private static final String FETCHALL="select * from orders";
	static Connection con;
	
	static {		
		con=dbconnection.connect();
	}
	private PreparedStatement pstmt;
	private Statement stmt;
	private ResultSet resultset;
	private ArrayList<orders> order;
	private ArrayList<orders> orderList;

	@Override
	public int insert(orders o) {
		try {
			pstmt =con.prepareStatement(INSERTQUERY);
			pstmt.setInt(1, o.getOrderid());
			pstmt.setInt(2, o.getUserid());
			pstmt.setInt(3, o.getRestaurentid());
			pstmt.setString(4, o.getOrdaerdate());
			pstmt.setFloat(5, o.getTotalamount());
			pstmt.setString(6, o.getStatus());
			pstmt.setString(7, o.getPaymentmode());			
			return pstmt.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public ArrayList<orders> fetchAll1() {
		
		try {
			
			stmt = con.createStatement();
			resultset=stmt.executeQuery(FETCHALL);
			while(resultset.next()) {
				order.add(
						new orders(
								resultset.getInt("orderid"),
								resultset.getInt("userid"),
								resultset.getInt("restaurentid"),
//								resultset.getTimestamp("orderdate"),
								resultset.getFloat("totalamount"),
								resultset.getString("status"),
								resultset.getString("paymentmode")					
									)
						);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return ordersList;
	}

	@Override
	public ArrayList<orders> fetchAll() {
		// TODO Auto-generated method stub
		return ordersList;
	}

	

}
