package com.lti.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	
	private Address address; // = new Address(); 
	
	public Employee()
	{
		
	}

	public Employee(int employeeId, String employeeName, double employeeSalary) 
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		
	}

	public int getEmployeeId() 
	{
		return employeeId;
	}

	public void setEmployeeId(int employeeId) 
	{
		this.employeeId = employeeId;
	}

	public String getEmployeeName()
	{
		return employeeName;
	}

	public void setEmployeeName(String employeeName) 
	{
		this.employeeName = employeeName;
	}

	public double getEmployeeSalary() 
	{
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) 
	{
		this.employeeSalary = employeeSalary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@PostConstruct
	public void init()
	{
		System.out.println("Init Called");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("Destroy Called");
	}


	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}
	
	
	
}
