package com.service;

import java.util.List;

import com.model.Employe;
import com.dao.EmployeDaoImpli;

public class EmployeServieceImpl implements EmployeService{
	private static EmployeDaoImpli dao=new EmployeDaoImpli();

	public void add(Employe employe) {
		// TODO Auto-generated method stub
		dao.add(employe);
		
	}

	public void update(Employe employe) {
		// TODO Auto-generated method stub
		//dao.update(0, 0);
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	public List<Employe> getAllemps() {
		
		return dao.getAllemp();
	}

	public void updatename(Employe employe) {
		// TODO Auto-generated method stub
		
	}

	public void batchInsertion(List<Employe> lemp) {
		dao.batchInsertion(lemp);
	}

	public void bacth_Insertion_Delete(List<Employe> insert,List<Employe> id) 
	{
		// TODO Auto-generated method stub
		dao.bacth_Insertion_Delete(insert, id);
		
	}

	
		
	}




