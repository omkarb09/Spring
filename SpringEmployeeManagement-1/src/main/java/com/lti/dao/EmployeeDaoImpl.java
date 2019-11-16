package com.lti.dao;

import java.util.ArrayList;
import java.util.List;

import com.lti.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao
{
	private static List<Employee> employees;
	
	public EmployeeDaoImpl() {
		//employees = new ArrayList<Employee>();
		System.out.println("Object of Dao implementation");
	}
	
	public static List<Employee> getEmployees() 
	{
		return employees;
	}

	public static void setEmployees(List<Employee> employees) 
	{
		EmployeeDaoImpl.employees = employees;
	}

	public boolean createEmployee(Employee employee) 
	{
		boolean result = employees.add(employee);
		return result;
	}

	public List<Employee> readAllEmployees() 
	{	
		return employees;
	}

}
