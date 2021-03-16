package com.abc.app1.db;
import java.util.ArrayList;
import java.util.List;
import com.abc.app1.dto.Employee1;

public class EmployeeDB1 {
	public static ArrayList<Employee1> employees=new ArrayList<Employee1>();
	public static ArrayList<Employee1> salarys=new ArrayList<Employee1>();
	public static ArrayList<Employee1> salaryRange=new ArrayList<Employee1>();
	
	public static int count;
	static {
		
		employees.add(new Employee1(101, "ramesh", 8, 10000));
		employees.add(new Employee1(102, "suresh", 2, 17000));
		employees.add(new Employee1(103, "rakesh", 1, 20000));
		employees.add(new Employee1(104, "lokesh", 5, 7000));
		
		}
		
		
	public static boolean addEmployee(Employee1 e)
	{
		
		employees.add(e);
		count=employees.size();
		return true;
	}
	
	public static int getCount()
	{
		return count;
	}
	public static boolean editExpByEmployeeId(int id,int empNewExp) {
		for(Employee1 employee : employees) {
			if(employee.getEmployeeId()==id) {
				employee.setExp(empNewExp);
				return true;
			}
		}
		return false;
	}
	public static boolean editSalaryByEmployeeID(int id,int empNewSalary) {
		for(Employee1 employee : employees) {
			if(employee.getEmployeeId()==id) {
				employee.setSalary(empNewSalary);
				return true;
			}
		}
		return false;
	}
	
	public static ArrayList<Employee1> getEmployeeBySalary(int salary) {
		salarys.clear();
		for (Employee1 employee : employees) {
			if(employee.getSalary()==salary) {
				salarys.add(employee);
			}

		}
			return salarys;
	}
	
	public static ArrayList<Employee1> getEmployessBySalaryRange(int salaryRangeMin, int salaryRangeMax) {
		salaryRange.clear();
		for (Employee1 employee : employees) {
			if(employee.getSalary()>=salaryRangeMin && employee.getSalary()<=salaryRangeMax) {
				salaryRange.add(employee);
				
				
			}

		}
		
		return salaryRange;
	}
}

}
