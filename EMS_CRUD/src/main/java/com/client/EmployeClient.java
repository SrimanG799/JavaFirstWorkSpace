package com.client;
import java.util.ArrayList;
import java.util.List;

import com.dao.EmployeDaoImpli;
import com.model.Employe;
import com.service.EmployeServieceImpl;



public class EmployeClient {
	public static void main(String[] args) {
//	Employe employe=new Employe(7, "ramya", 60500, "warangal");
//	EmployeDaoImpli impli=new EmployeDaoImpli();
	//	impli.add(employe);
//		EmployeServieceImpl impsli=new EmployeServieceImpl();
//		List<Employe> employes=impsli.getAllemps();
//		for(Employe employei:employes)
//		{
//			System.out.println(employei);
//		}
//		
//		
	EmployeDaoImpli i=new EmployeDaoImpli();
//		//i.update(15000, 2);
//		i.updateName("ramesh", 2);
//		System.out.println("seces");
		
		i.delete(2);
		
		
	}

}
