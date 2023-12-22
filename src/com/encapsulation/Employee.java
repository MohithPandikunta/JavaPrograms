package com.encapsulation;

public class Employee {
	String name;
	private String id;
	private double salary;
	String role;
	
	public Employee(String name, String role) {
		this.name = name;
		this.role = role;
		
	}
	public void employeeDetails() {
	}
	{
		System.out.println("EmployeeDetails");
		System.out.println("********************");
		System.out.println("Name:"+name);
		System.out.println("Id:"+getId());
		System.out.println("salary:"+getSalary());
		System.out.println("Role:"+role);
		
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
