package com.abc.app1.dao;

import java.util.ArrayList;

import com.abc.app1.dto.Employee1;
import com.abc.app1.exceptions.InvalidEmployeeIdException1;
import com.abc.app1.exceptions.WrongSalaryException1;

public interface IEmployeeDAO1 {
	
	public boolean addEmployee(Employee1 e)throws WrongSalaryException1;
	 
	 public boolean editSalaryByEmployeeId(int id,int empNewSalary)throws InvalidEmployeeIdException1;
	 
	 public boolean editExpByEmployeeId(int id,int empNewExp)throws InvalidEmployeeIdException1;
	 
	 public ArrayList<Employee1> getAllEmployees();
	 
	 public ArrayList<Employee1> getEmployeeBySalary(int salary);
	 
	 public ArrayList<Employee1> getEmployessBySalaryRange(int salaryRangeMin,int salaryRangeMax);
	 
}
