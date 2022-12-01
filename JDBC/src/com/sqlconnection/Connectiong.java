package com.sqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Connectiong 
{
	public static void main(String[] args) throws SQLException, ClassNotFoundException 
	{
		
		Connection con=null;
		Statement stmt=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sriman","root","sql799");
		stmt= con.createStatement();
		int result=stmt.executeUpdate("insert into developer values(19,'manju','web','nbn',65000)");
	  
		System.out.println(result);
		//System.out.println(rs);
		
		
		
	}
		//catch()
		finally
		{
		stmt.close();
			con.close();
		}
		
	}
}


