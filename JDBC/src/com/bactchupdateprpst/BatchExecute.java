package com.bactchupdateprpst;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class BatchExecute {
	public static void main(String[] args) {
		Connection con=null;
	PreparedStatement pst=null;
		ResultSet rs=null;
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sriman","root","sql799");
		pst=con.prepareStatement("select*from mba");
		rs=pst.executeQuery();
	//	"jdbc:mysql://localhost:3306/college","root","sql799"
		while(rs.next())
		{
			System.out.println(" id  "+rs.getInt("id"));
			System.out.println("name "+rs.getString("name"));
			System.out.println("age  "+rs.getInt("age"));
			
		}
		
		
		
		
		
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
	}

}
