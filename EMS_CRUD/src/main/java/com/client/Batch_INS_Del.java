package com.client;

import java.util.ArrayList;
import java.util.List;

import com.model.Employe;
import com.service.EmployeServieceImpl;

public class Batch_INS_Del {
	public static void main(String[] args) {
		List<Employe> empI=new ArrayList<Employe>();
		empI.add(new Employe(8, "ramesh", 84000, "warangal"));
		empI.add(new Employe(9, "rajesh", 36000, "kadapa"));
		empI.add(new Employe(10, "mahesh", 85000, "chittor"));
		EmployeServieceImpl eimp=new EmployeServieceImpl();
		List<Employe> empD=new ArrayList<Employe>();
		empD.add(new Employe(1));
		empD.add( new Employe(5));
		eimp.bacth_Insertion_Delete(empI, empD);
		
		
		
		
	}

}
