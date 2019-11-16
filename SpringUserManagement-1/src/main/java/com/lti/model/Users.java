package com.lti.model;

import java.io.Serializable;


public class Users implements Serializable
{
	
	private String username;
	

	private String password;
	
	
	private String firstname;
	

	private String lastname;
	
	
	private String mobilenumber;
	
	
	
	public Users() {
		super();
	}



	public Users(String username, String password, String firstname, String lastname, String mobilenumber) {
		super();
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.mobilenumber = mobilenumber;
	}

	


	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public String getMobilenumber() {
		return mobilenumber;
	}



	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}



	@Override
	public String toString() {
		return "Username : " + username + "\nPassword : " + password + "\nFirstname : " + firstname + "\nLastname : "
				+ lastname + "\nMobilenumber : " + mobilenumber + "\n";
	}
	
	
}
