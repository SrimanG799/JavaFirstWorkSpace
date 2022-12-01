package com.bactchupdateprpst;

import java.sql.Connection;

import com.jdbcUtility.UtilClass;

public class ConnectionTest {
	
	
	public static void main(String[] args) {
		Connection connection=UtilClass.connection();
		System.out.println(connection);
		
	}

}
