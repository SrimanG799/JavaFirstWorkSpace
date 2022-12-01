package com.bactchupdateprpst;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class BactchUpdate {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con=null;
		PreparedStatement pst=null;
		try {
			
			ArrayList<Student> s=new ArrayList<Student>();
			s.add(new Student(1, "sriman", 26));
			s.add(new Student(2, "shan", 22));
			s.add(new Student(3, "pooja", 23));
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sriman","root","sql799");
			pst=con.prepareStatement("insert into MBA values(?,?,?)");
			for (Student student : s) {
				pst.setInt(1, student.getId());
				pst.setString(2, student.getName());
				pst.setInt(3, student.getAge());
				pst.addBatch();
				
				
				
			}
			int[] arr=pst.executeBatch();
			for (int i : arr) {
				System.out.println(i);
				
			}
			
				
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


