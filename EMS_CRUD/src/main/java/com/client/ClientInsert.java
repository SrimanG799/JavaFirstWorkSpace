package com.client;

import java.util.ArrayList;
import java.util.List;

import com.dao.EmployeDaoImpli;
import com.model.Employe;
import com.service.EmployeServieceImpl;

public class ClientInsert {
	public static void main(String[] args) {
	//---->>>>>normal insertion	
	//	Employe employe=new Employe(8, "rohan", 60500, "warangal");
	//	EmployeDaoImpli impli=new EmployeDaoImpli();
	   //    impli.add(employe);
		//--normal insertion
		List<Employe> emp=new ArrayList();
		emp.add(new Employe(27, "rajini", 45000, "srikakulam"));
		emp.add(new Employe(28, "sravanthi", 35000, "89000"));
		emp.add(new Employe(29, "ramya", 45000, "karimnagar"));
		
		
	//--->>> batchinsertion not recommanded must add methods in service layer	
		//List<Employe> Lemp =new ArrayList<Employe>();
	//	Lemp.addAll(emp);
		
		//EmployeDaoImpli allempI=new EmployeDaoImpli();
		       //    allempI.batchInsertion(emp);
		//---->>>>>not recomended
		
		
		EmployeServieceImpl esiemp=new EmployeServieceImpl();
		esiemp.batchInsertion(emp);
	
		
		
	}

}
