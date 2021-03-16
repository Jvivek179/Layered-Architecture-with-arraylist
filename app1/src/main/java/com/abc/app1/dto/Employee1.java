package com.abc.app1.dto;

public class Employee1 {
	private int employeeId;
	private String name;
	private int exp;
	private int salary;
	
	
	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee1(int employeeId, String name, int exp, int salary) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.exp = exp;
		this.salary = salary;
	}


	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee1 [employeeId=" + employeeId + ", name=" + name + ", exp=" + exp + ", salary=" + salary + "]";
	}
}
