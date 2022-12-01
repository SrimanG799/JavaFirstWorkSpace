package com.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbcUtility.UtilClass;

public class TableCreation {
	static String s="create table Tablejd("+"id int(2),"+"name varchar(20),"+"age int(2))"; 
	public static void main(String[] args) {
		Connection connection=UtilClass.connection();
		PreparedStatement pst;
		try {
			pst = connection.prepareStatement(s);
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	
			
			
			
			
		}
	}


