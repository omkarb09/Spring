package com.lti.model;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	
	private Address address; // = new Address(); 
	
	/*public Employee()
	{
		System.out.println("Object of Employee");
	}*/

	public Employee(int employeeId, String employeeName, double employeeSalary) {
		super();
		
		System.out.println("Parameterized constructor called");
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		
	}

	public int getEmployeeId() {
		return employeeId;
	}



	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}



	public String getEmployeeName() {
		return employeeName;
	}



	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}



	public double getEmployeeSalary() {
		return employeeSalary;
	}



	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}



	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "EmployeeId : " + employeeId + "\nEmployeeName : " + employeeName + "\nEmployeeSalary : "
				+ employeeSalary +"\n";
	}
	
	
	
}
