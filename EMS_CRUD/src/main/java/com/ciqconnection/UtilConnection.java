package com.ciqconnection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class UtilConnection {
	
	
	
	private static Connection connection = null;
	private static Statement st = null;
	private static ResultSet rs = null;
	private static Properties prop = null;

	static {
		try {
			 prop=new Properties();
			 
			 
			 prop.load(UtilConnection.class.getClassLoader().getResourceAsStream("db.properties"));
			 Class.forName(prop.getProperty("Driver"));
			 connection=DriverManager.getConnection(prop.getProperty("URL"),prop.getProperty("User"),prop.getProperty("Password"));
			 
			 
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
		public static Connection getConnection()
		{
			return connection;
		}
		public static void closeConnection()
		{
			try {
				connection.close();
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
			public static void closeConnection(Statement st)
			{
				try {
					st.close();
					closeConnection();
				}
				catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			public static void closeConnection(Statement st,ResultSet rs)
			{
				if(rs!=null)
				{
					try {
						closeConnection(st);
						rs.close();
					}
					catch (Exception e) {
						e.printStackTrace();
					}
				}
			
			
		

	
	}
			public static void main(String[] args) {
				System.out.println(getConnection());
			}
	
	

}
