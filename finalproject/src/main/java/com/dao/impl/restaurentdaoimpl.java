package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.dao.dbutil.dbconnection;
import com.dao.model.restaurent;

public class restaurentdaoimpl {
	
	static ArrayList<restaurent> restaurentList=new ArrayList<restaurent>();
	private static final String INSERTQUERY="insert into restaurent (restaurentid,name,cuisinetype,delivarytime,address,ratings,isactive,imagepath)values(?,?,?,?,?,?,?,?)";
	private static final String FETCHALL="select * from restaurent";
	static Connection con;
	
	static {		
		con=dbconnection.connect();
	}
	private PreparedStatement pstmt;
	private Statement stmt;
	private ResultSet resultset;
	public int insert(restaurent r) {
		try {
			pstmt =con.prepareStatement(INSERTQUERY);
			pstmt.setInt(1, r.getRestaurentid());
			pstmt.setString(2, r.getName());
			pstmt.setString(3, r.getCuisinetype());
			pstmt.setInt(4, r.getDelivarytime());
			pstmt.setString(5, r.getAddress());
			pstmt.setFloat(6, r.getRatings());
			pstmt.setBoolean(7, r.isIsactive());
			pstmt.setString(8, r.getImagepath());
			
			return pstmt.executeUpdate();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public ArrayList<restaurent> fetchAll() {
		
		try {
			stmt = con.createStatement();
			resultset=stmt.executeQuery(FETCHALL);
			while(resultset.next()) {
				restaurentList.add(
						new restaurent(
								resultset.getInt("restaurentid"),
								resultset.getString("name"),
								resultset.getString("cuisinetype"),
								resultset.getInt("delivarytime"),
								resultset.getString("address"),
								resultset.getFloat("ratings"),
								resultset.getBoolean("isactive"),
								resultset.getString("iamgepath")					
								)
						);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return restaurentList;
		
	}

}
