package com.sqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connection2 {
	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sriman","root","sql799");
			stmt=con.createStatement();
			int result=stmt.executeUpdate("INSERT INTO DEVELOPER VALUES(20,'arya','database','sql',65000)");
		}
		catch(ClassNotFoundException e)
		{ 
			e.printStackTrace();
		
	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
			try {
				stmt.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
	

}
}
