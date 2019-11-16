package com.lti.ui;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.model.Employee;
import com.lti.service.EmployeeService;

public class Main 
{

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		Employee employee = context.getBean("employee", Employee.class);
		
		EmployeeService service = context.getBean("service", EmployeeService.class);
		//System.out.println(employee);
		boolean result =  service.addEmployee(employee);
		if(result)
		{
			System.out.println("Employee added successfully in-memory database\n");
		}
		else 
		{
			System.out.println("Employee not added");
		}
		
		List<Employee> list = service.findAllEmployees();
		for(Employee e : list)
		{
			System.out.println(e);
		}
	}

}
