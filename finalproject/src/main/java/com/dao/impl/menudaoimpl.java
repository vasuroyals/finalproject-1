package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.dao.dbutil.dbconnection;
import com.dao.interfaces.menudao;
import com.dao.model.menu;
import com.dao.model.restaurent;
public class menudaoimpl implements menudao{
	
	
	static ArrayList<menu> menuList=new ArrayList<menu>();
	private static final String INSERTQUERY="insert into menu (menuid,restaurentid,name,description,price,isavailable,imagepath)values(?,?,?,?,?,?,?)";
	private static final String FETCHALL="select * from menu";
	static Connection con;
	
	static {
		
		con=dbconnection.connect();
	}
	private PreparedStatement pstmt;
	private Statement stmt;
	private ResultSet resultset;

	@Override					
	public int insert (menu m) {
		try {
			pstmt =con.prepareStatement(INSERTQUERY);
			pstmt.setInt(1,m.getMenuid());
			pstmt.setInt(2, m.getRestaurentid());
			pstmt.setString(3, m.getName());
			pstmt.setString(4, m.getDescription());
			pstmt.setInt(5, m.getPrice());
			pstmt.setBoolean(6, m.getisavailable());
			pstmt.setString(7, m.getImagepath());
			return pstmt.executeUpdate();			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	@Override
	public ArrayList<menu> fetchAll() {
		
		try {
			
			stmt = con.createStatement();
			resultset=stmt.executeQuery(FETCHALL);
			while(resultset.next()) {
				menuList.add(
						new menu(
								resultset.getInt("menuid"),
								resultset.getInt("restaurentid"),
								resultset.getString("name"),
								resultset.getString("description"),
								resultset.getInt("price"),
								resultset.getBoolean("isavailable"),
								resultset.getString("imagepath")				
								)
						);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return menuList;
		
	}
}
