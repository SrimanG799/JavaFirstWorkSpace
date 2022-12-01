package com.client;

import java.util.ArrayList;
import java.util.List;

import com.model.Employe;
import com.service.EmployeServieceImpl;

public class Batch_insertion_Client {
	public static void main(String[] args) {
		
		
		List<Employe> emp=new ArrayList<Employe>();
		emp.add(new Employe(5, "sri", 5600, "hyd"));
		emp.add(new Employe(7, "mahesh", 4700, "ap"));
		emp.add(new Employe(6, "pujj", 4500, "hzb"));
		
		
		
		
		EmployeServieceImpl impl=new EmployeServieceImpl();
		impl.batchInsertion(emp);
		
	}

}
