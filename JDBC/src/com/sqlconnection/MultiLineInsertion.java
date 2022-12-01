package com.sqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MultiLineInsertion {
	public static void main(String[] args) throws SQLException {
		Connection con=null;
		Statement stmt=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql//localhost:3306/sriman","root","sql799");
			 stmt=con.createStatement();
			 stmt.addBatch("insert into developer values(22,'sai','web','script',87000)");
		 stmt.addBatch("insert into developer values(23,'sameer','web','script',87000)");
		 stmt.addBatch("insert into developer values(25,'sham','data','sql',87000)");
			 stmt.addBatch("insert into developer values(26,'anil','web','python',87000)");
			 stmt.addBatch("insert into developer values(27,'saiprasad','web','script',87000)");
			 stmt.addBatch("insert into developer values(28,'saikiran','web','script',87000)");
		
		 stmt.executeBatch();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		finally {
			try {
			stmt.close();
			con.close();
			}
			catch(SQLException e2)
			{
				e2.printStackTrace();
			}
		}
		
	}

}
