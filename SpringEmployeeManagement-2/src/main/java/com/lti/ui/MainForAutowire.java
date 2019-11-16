package com.lti.ui;


import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.model.Employee;
import com.lti.service.EmployeeService;

public class MainForAutowire {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextWithAutowire.xml");
		
		
		EmployeeService service = context.getBean("service",EmployeeService.class);
		
		Employee employee = context.getBean("employee",Employee.class);
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter employee Id : ");
		employee.setEmployeeId(s.nextInt());
		
		System.out.println("Enter employee name : ");
		employee.setEmployeeName(s.next());
		
		System.out.println("Enter employee salary :");
		employee.setEmployeeSalary(s.nextDouble());
		
		boolean result = service.addEmployee(employee);
		if(result)
		{
			List<Employee> list = service.findAllEmployees();
			for(Employee e : list)
			{
				System.out.println(e);
			}
		}
		else
		{
			System.out.println("Employee data not saved");
		}
	}

}
