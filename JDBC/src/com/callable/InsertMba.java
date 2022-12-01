package com.callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

import com.jdbcUtility.UtilClass;

public class InsertMba {
	public static void main(String[] args) {
		Connection con=null;
		CallableStatement cst=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sriman","root","sql799");
			cst=con.prepareCall("{call mbaupdte(?,?)}");
		
			cst.setInt(1, 4);
			cst.setString(2, "pavan");
			//cst.setInt(3,26);
			cst.execute();
			System.out.println("aindhi");
	
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
				cst.close();
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
