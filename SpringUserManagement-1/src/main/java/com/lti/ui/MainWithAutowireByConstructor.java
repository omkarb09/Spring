package com.lti.ui;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.model.Users;
import com.lti.service.UserService;

public class MainWithAutowireByConstructor {

	public static ApplicationContext context;
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("applicationContextWithAutowireByConstructor.xml");
		
		UserService service = context.getBean("service", UserService.class);
		
		//Read All
	 	List<Users>list = service.findAllUsers();
	 	
	 	for(Users u : list)
	 	{
	 		System.out.println(u);
	 	}
	
		//Read User By Username
		/*
		 	Users user = service.findUserByUsername("JackSparrow");
	 		System.out.println(user);
	 	*/
		
		//Read Login
			/*boolean result=service.checkLogin("test","test");
			
			if(result)
			{
				System.out.println("Correct username and password");
			}
			else
			{
				System.out.println("Invalid username or password");
			}*/
		
		
		//Delete User
		/*boolean result=service.removeUser("Ishan");
		
		if(result)
		{
			System.out.println("User deleted");
		}*/
		
		//Add User
		/*boolean result=service.addUser(context.getBean("user", Users.class));
		if(result)
		{
			System.out.println("User added");
		}*/
		
		//Update User
	 	/*Users user = service.updateUser(context.getBean("user", Users.class));
	 	System.out.println(user);*/
		
		

	}

}
