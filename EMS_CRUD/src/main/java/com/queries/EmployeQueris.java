package com.queries;

public interface EmployeQueris {
	 static String INSERT_EMP = "insert into employees values(?, ?, ?,?)";
	 static String SELECT_ALL_EMPS = "select * from employees";
	 public String UPDATE_SALARY_WITH_ID="update Employees set salary=? where id=?";
	 public String UPDATE_NAME_WITH_ID="update employees set name=? where id=?";
	 public String DELETE_WITH_ID="DELETE FROM employees WHERE id=?";

}
