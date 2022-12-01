package com.preparedstatement;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Date;

public class ImageDate {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pst=null;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","sql799");
			pst=con.prepareStatement("insert into image(id,name,bomma,datel) values(?,?,?,?)");
			pst.setInt(1, 4);
			pst.setString(2, "srkkd");
			FileInputStream in=new FileInputStream("C:\\Users\\srima\\OneDrive\\Pictures\\bird.png");
			pst.setBlob(3, in);
		//	Date date =new Date();
			java.sql.Date sdate=new java.sql.Date(2022, 10, 10);
			pst.setDate(4, sdate);
			
		
		int result=pst.executeUpdate();
		System.out.println("success");
			
	
			
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
				pst.close();
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
	}

}
