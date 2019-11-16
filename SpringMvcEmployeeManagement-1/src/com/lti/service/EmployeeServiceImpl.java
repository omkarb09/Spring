package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.EmployeeDao;
import com.lti.model.Employee;

@Service("service")
public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired  
	private EmployeeDao dao;
	public boolean addEmployee(Employee employee) 
	{
		int result = dao.createEmployee(employee);
		if(result==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public List<Employee> findAllEmployees() 
	{
		List<Employee> list = dao.readAllEmployees();
		return list;
	}

	public boolean removeEmployee(int employeeId) {
		int result = dao.deleteEmployee(employeeId);
		
		if(result==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public Employee modifyEmployee(Employee employee) {
		Employee employee2 = dao.updateEmployee(employee);
		return employee2;
	}

	public void setDao(EmployeeDao dao) {
		this.dao = dao;
	}
	
	

}
