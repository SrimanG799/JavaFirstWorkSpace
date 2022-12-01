package com.client;

import java.util.List;

import com.model.Employe;
import com.service.EmployeServieceImpl;

public class ClientSelect {
	public static void main(String[] args) {
		
	
	
	EmployeServieceImpl impli=new EmployeServieceImpl();
	List<Employe> employes=impli.getAllemps();
	for(Employe employei:employes)
	{
		System.out.println(employei);
	}
	
	

}
}
