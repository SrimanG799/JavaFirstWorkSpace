package com.service;
import java.util.List;

import com.model.Employe;

public interface EmployeService {
	
	void add(Employe employe);
	void update(Employe employe);
	void updatename(Employe employe);
	void delete(int id);
	List<Employe> getAllemps();
	public void batchInsertion(List<Employe> lemp);
	public void bacth_Insertion_Delete(List<Employe> insert,List<Employe> id);

}
