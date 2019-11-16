package com.lti.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="HelloApp")
public class HelloController {
	
	//http://localhost:9090/HelloApp/hello
	@RequestMapping(path="hello", method=RequestMethod.GET)
	public String hello()
	{
		return "Hello From SpringRest";	
	}
}
