package com.lti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {
	public static void main(String[] args) 
	{
		ApplicationContext context = SpringApplication.run(Main.class, args);
		String beans[] = context.getBeanDefinitionNames();
		for(String bean: beans)
		{
			System.out.println(bean);
		}
	}
}
