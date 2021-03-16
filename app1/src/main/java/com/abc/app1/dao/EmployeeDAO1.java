package com.abc.app1.dao;

import java.util.ArrayList;
import com.abc.app1.db.EmployeeDB1;
import com.abc.app1.dto.Employee1;
import com.abc.app1.exceptions.InvalidEmployeeIdException1;
import com.abc.app1.exceptions.WrongSalaryException1;

public class EmployeeDAO1 implements IEmployeeDAO1 {
	
	public boolean addEmployee(Employee1 e) throws WrongSalaryException1 {
		// TODO Auto-generated method stub
		return EmployeeDB1.addEmployee(e);
	}

	public boolean editSalaryByEmployeeId(int id, int empNewSalary) throws InvalidEmployeeIdException1 {
		// TODO Auto-generated method stub
		return EmployeeDB1.editSalaryByEmployeeID(id,empNewSalary);
	}

	public boolean editExpByEmployeeId(int id, int empNewExp) throws InvalidEmployeeIdException1 {
		// TODO Auto-generated method stub
		return EmployeeDB1.editExpByEmployeeId(id,empNewExp);
	}

	public ArrayList<Employee1> getAllEmployees() {
		// TODO Auto-generated method stub
		return EmployeeDB1.employees;
	}

	public ArrayList<Employee1> getEmployeeBySalary(int salary) {
		// TODO Auto-generated method stub
		return EmployeeDB1.getEmployeeBySalary(salary);
	}

	public ArrayList<Employee1> getEmployessBySalaryRange(int salaryRangeMin, int salaryRangeMax) {
		// TODO Auto-generated method stub
		return EmployeeDB1.getEmployessBySalaryRange(salaryRangeMin, salaryRangeMax);
	}
}
