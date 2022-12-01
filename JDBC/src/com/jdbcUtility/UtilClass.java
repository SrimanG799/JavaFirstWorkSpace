package com.jdbcUtility;

import java.sql.Connection;
import java.sql.DriverManager;

public class UtilClass {


	
	public static Connection connection()
	
	{
		Connection con=null;
		try {

		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","sql799");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		return con;
		
	}
	

}
