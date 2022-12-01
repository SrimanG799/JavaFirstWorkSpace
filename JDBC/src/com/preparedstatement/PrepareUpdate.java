package com.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrepareUpdate {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Connection con=null;
		PreparedStatement pst=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sriman","root","sql799");
			pst=con.prepareStatement("insert into employe values(?,?,?,?,?)");
			pst.setInt(1, 106);
			pst.setString(2, "gurram");
			pst.setDouble(3, 45000);
			pst.setString(4, "hyd");
			pst.setString(5, "fsfsffs@gmail.com");
			
			int result=pst.executeUpdate();
		System.out.println(result+"update sucesfulli");
				
			}
		
		finally {
			try {
				pst.close();
				con.close();
		}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
	}

}
