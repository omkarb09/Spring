package com.lti.ui;

import com.lti.model.Address;
import com.lti.model.Employee;

public class Main {

	public static void main(String[] args) {
		
		Employee employee = new Employee(1000,"Jack",5000);
		Address address = new Address("Pirate Cove","Serel","500600");
		
		employee.setAddress(address);
		
		System.out.println(employee);
		System.out.println(employee.getAddress());

	}

}
