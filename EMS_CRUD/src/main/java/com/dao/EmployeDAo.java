package com.dao;
import java.util.List;
import com.model.Employe;
public interface EmployeDAo {
	//create delete update
	void add(Employe employe);
	void update( double salary,int ID);
	void updateName(String name,int ID);
	int delete(int id);
	List<Employe> getAllemp();
	public void batchInsertion(List<Employe> lemp);
	public void bacth_Insertion_Delete(List<Employe> insert,List<Employe> id);
	
	
	

}
