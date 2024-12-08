	package com.dao.impl;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.dao.dbutil.dbconnection;
import com.dao.interfaces.userdao;
import com.dao.model.orders;
import com.dao.model.user;


public class userdaoimpl implements userdao {
	static ArrayList<user> userList=new ArrayList<user>();
	private static final String INSERTQUERY="insert into user (userid,username,password,email,address)values(?,?,?,?,?)";
	private static final String FETCHALL="select * from user";
	static Connection con;
	static {		
		con=dbconnection.connect();
			}
	private PreparedStatement pstmt;
	private Statement stmt;
	private ResultSet resultset;
	@Override
	public int insert(user u) {
		try {
			pstmt =con.prepareStatement(INSERTQUERY);
			pstmt.setInt(1, u.getUserid());
			pstmt.setString(2, u.getUsername());
			pstmt.setString(3, u.getPasswrod());
			pstmt.setString(4, u.getEmail());
			pstmt.setString(5, u.getAddress());	
			return pstmt.executeUpdate();			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	@Override
	public ArrayList<user> fetchAll() {		
		try {		
			stmt = con.createStatement();
			resultset=stmt.executeQuery(FETCHALL);
			while(resultset.next()) {
				userList.add(
						new user(
								resultset.getInt("userid"),
								resultset.getString("username"),
								resultset.getString("password"),
								resultset.getString("email"),
								resultset.getString("address")
								)
						);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return userList;
		
	}

}
