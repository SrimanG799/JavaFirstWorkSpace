package com.sqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;

public class InsertIntoStudentData {
	
	public static void main(String[] args) {
		Connection connection=null;
		Statement statement=null;
		ResultSet getdata=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","sql799");
			 statement=connection.createStatement();
//			 
//			 statement.addBatch("insert into students values (4,'sriman',7000)");
//			 statement.addBatch("insert into students values(5,'shan',8000)");
		// statement.addBatch("insert into students values (4,'mahesh',9000)");
			int ex[]= statement.executeBatch();
			
			 getdata=statement.executeQuery("select* from students group by college_fee ");
			 while (getdata.next()) {
				 
 System.out.println("ID: "+getdata.getInt("id")+" Name :"+getdata.getString("name")+" College_Fee "+getdata.getDouble("college_fee"));
				 
				 
				
				
			}
			 
			
			 
			 
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		finally {
		try {
			getdata.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			
			
		}
	
	
		
	}

}
