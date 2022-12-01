package com.preparedstatement;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RetriveImage {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","sql799");
			pst=con.prepareStatement("select*from image");
			rs=pst.executeQuery();
			while(rs.next())
			{
			System.out.println("id "+rs.getInt("id")+" name  "+rs.getString("name")+" date  "+rs.getDate("datel"));
			FileOutputStream fos=new FileOutputStream("C:\\Users\\srima\\OneDrive\\Pictures\\dbimg.png");
			fos.write(rs.getBytes("bomma"));
			
			
			
			
			
			
			
			}
		}
			
	
			
		catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
finally {
	try {
		pst.close();
	con.close();
	}
	catch (Exception e) {
		e.printStackTrace();// TODO: handle exception
	}
}
}
}
