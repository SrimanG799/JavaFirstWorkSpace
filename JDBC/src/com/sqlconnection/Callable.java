package com.sqlconnection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class Callable {
	public static void main(String[] args) {
		Connection con=null;
		CallableStatement cal=null;
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sriman","root","sql799");
				cal=con.prepareCall("{?=call test (?,?)}");
				
				cal.setInt(2, 20);
				cal.setInt(3, 10);
				cal.registerOutParameter(1, Types.INTEGER);
				cal.execute();
				System.out.println("result "+cal.getInt(1));
				
				
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				try {
					cal.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
	}

}
