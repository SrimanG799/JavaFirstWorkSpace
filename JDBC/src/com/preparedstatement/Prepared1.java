package com.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Prepared1 {
	public static void main(String[] args) {
		
		
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sriman","root","sql799");
			pst=con.prepareStatement("select*from employe");
			rs=pst.executeQuery();
			while(rs.next())
			{
				System.out.println("id "+rs.getInt("id")+"name  "+rs.getString("name")+"salary  "+rs.getDouble("salary"));
				
			}
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				rs.close();
				pst.close();
				con.close();
			}
			catch (Exception e1) {
				// TODO: handle exception
				e1.printStackTrace();
			}
		}
		
		
	}
	

}
