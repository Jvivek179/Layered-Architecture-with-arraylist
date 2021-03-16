package com.abc.app1.service;

import java.util.ArrayList;
import com.abc.app1.dao.EmployeeDAO1;
import com.abc.app1.dao.IEmployeeDAO1;
import com.abc.app1.db.EmployeeDB1;
import com.abc.app1.dto.Employee1;
import com.abc.app1.exceptions.InvalidEmployeeIdException1;
import com.abc.app1.exceptions.WrongSalaryException1;

public class EmployeeService1 implements IEmployeeService1 {
	
IEmployeeDAO1 dao;
	
	public EmployeeService1() {
		dao = new EmployeeDAO1();
	}


	public boolean addEmployee(Employee1 e) throws WrongSalaryException1 {
		// TODO Auto-generated method stub
		if(e.getSalary()> 50000)
		{
			throw new WrongSalaryException1();
		}
		else return dao.addEmployee(e);		
	
	}

	public boolean editSalaryByEmployeeId(int id, int empNewSalary) throws InvalidEmployeeIdException1 {
		// TODO Auto-generated method stub
		if(!dao.editSalaryByEmployeeId(id,empNewSalary))
		{
			throw new InvalidEmployeeIdException1();
		}
		else return dao.editExpByEmployeeId(id,empNewSalary);
	}
	

	public boolean editExpByEmployeeId(int id, int empNewExp) throws InvalidEmployeeIdException1 {
		// TODO Auto-generated method stub
		if(!dao.editExpByEmployeeId(id,empNewExp))
		{
			throw new InvalidEmployeeIdException1();
		}
		else return dao.editExpByEmployeeId(id,empNewExp);
	}

	public ArrayList<Employee1> getAllEmployees() {
		// TODO Auto-generated method stub
		return dao.getAllEmployees();
	}

	public ArrayList<Employee1> getEmployeeBySalary(int salary) {
		// TODO Auto-generated method stub
		return dao.getEmployeeBySalary(salary);
	}

	public ArrayList<Employee1> getEmployeeBySalaryRange(int salaryRangeMin, int salaryRangeMax) {
		// TODO Auto-generated method stub
		return dao.getEmployessBySalaryRange(salaryRangeMin, salaryRangeMax);
	}
	

}
