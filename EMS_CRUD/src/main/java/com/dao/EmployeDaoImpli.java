package com.dao;
import com.model.Employe;

import com.queries.EmployeQueris;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ciqconnection.UtilConnection;


public class EmployeDaoImpli implements EmployeDAo{

	public void add(Employe employe) {
		PreparedStatement pst=null;
		try {
	Connection connection=UtilConnection.getConnection();
	// pst=connection.prepareStatement("insert into employees values(?, ?, ?,?)");
	 //instead we can use below statement defined in Quries
	 pst=connection.prepareStatement(EmployeQueris.INSERT_EMP);
	 pst.setInt(1, employe.getId());
	 pst.setString(2,employe.getName());
	 pst.setDouble(3, employe.getSalary());
	 pst.setString(4, employe.getLocation());
	int result= pst.executeUpdate();
	System.out.println(result);
	 
		
	}
		catch (Exception e) {
		e.printStackTrace();
		}
		finally {
			UtilConnection.closeConnection(pst);
		}
	}
	

	public int delete(int id) {
		Connection connection=null;
		PreparedStatement pst=null;
		try {
			connection =UtilConnection.getConnection();
			pst=connection.prepareStatement("DELETE FROM Employees WHERE id=?");
			pst.setInt(1, id);
			pst.execute();
			System.out.println("item deleted");
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			UtilConnection.closeConnection(pst);
			
		}
		
		return 1;
	}

	public List<Employe> getAllemp() {
		List<Employe> employes=new ArrayList<Employe>();
		Connection connection=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
			connection=UtilConnection.getConnection();
			pst=connection.prepareStatement(EmployeQueris.SELECT_ALL_EMPS);
			rs=pst.executeQuery();
			while(rs.next())
			{
				Employe employe=new Employe();
				employe.setId(rs.getInt(1));
				employe.setName(rs.getString(2));
				employe.setSalary(rs.getDouble(3));
				employe.setLocation(rs.getString(4));
				employes.add(employe);
			}
			return employes;
				
				
				
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		UtilConnection.closeConnection(pst, rs);
		
		return null;
	}


	public void update(double salary, int ID) {
		Connection connection=null;
		PreparedStatement ps=null;
		
		connection =UtilConnection.getConnection();
		try {
			ps=connection.prepareStatement(EmployeQueris.UPDATE_SALARY_WITH_ID);
	//ps=connection.prepareStatement("update employee set salary=? where id=?");		
			ps.setInt(2, ID);
			ps.setDouble(1,salary);
			ps.execute();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			
			UtilConnection.closeConnection(ps);
		}
		
		
		
		
	}


	public void updateName(String name, int ID) {
		
		Connection connection=null;
		PreparedStatement ps=null;
		try {
			connection=UtilConnection.getConnection();
			//ps=connection.prepareStatement(EmployeQueris.UPDATE_NAME_WITH_ID);
			ps=connection.prepareStatement("update employees set name=? where id=?");
			ps.setInt(2,ID);
			ps.setString(1,name);
			ps.execute();
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			UtilConnection.closeConnection(ps);
		}
		
		
		// TODO Auto-generated method stub
		
	}


	public void batchInsertion(List<Employe> lemp) {
		// TODO Auto-generated method stub
		
		Connection connection=null;
		PreparedStatement pst=null;
		try {
			//Employe empg=new Employe();
			connection=UtilConnection.getConnection();
			connection.setAutoCommit(false);
			pst=connection.prepareStatement("insert into employees values(?,?,?,?)");
			for (Employe employel : lemp) {
				
			
			pst.setInt(1, employel.getId());
			pst.setString(2,employel.getName());
			pst.setDouble(3, employel.getSalary());
			pst.setString(4,employel.getLocation());
			pst.execute();
			
			
		}
			connection.commit();
			System.out.println("insertinon batch succes");
		}
			
		catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			System.out.println(e.getMessage());
		}finally {
			UtilConnection.closeConnection(pst);
		
		}
		
		
	
	}


	


	public void bacth_Insertion_Delete(List<Employe> insert, List<Employe> id) {
		Connection connection=null;
		PreparedStatement pstI=null;
		PreparedStatement pstd=null;
		connection=UtilConnection.getConnection();
		
		try {
			connection.setAutoCommit(false);
			
			pstI=connection.prepareStatement(EmployeQueris.INSERT_EMP);
			pstd=connection.prepareStatement(EmployeQueris.DELETE_WITH_ID);
			for (Employe employei :insert) {
				
			
			pstI.setInt(1, employei.getId());
			pstI.setString(2,employei.getName());
			pstI.setDouble(3,employei.getSalary());
			pstI.setString(4, employei.getLocation());
			pstI.execute();
			System.out.println("insertion seccess");
			}
			for (Employe employed : id) {
				pstd.setInt(1, employed.getId());
				pstd.execute();
				System.out.println("delete success");
				
			}
			connection.commit();
			
		}
		catch (Exception e) {
			// TODO: handle exception
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		finally {
			UtilConnection.closeConnection(pstI);
			
		}
			
			
		
		
		
		
		
	}
}
