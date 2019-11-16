package com.lti.dao;

import java.util.List;

import com.lti.model.Users;

public interface UserDao 
{
	public int readLogin(String username, String password);
	public List<Users> readAllUsers();
	public Users readUserByUsername(String username);
	public int deleteUser(String username);
	public int createUser(Users user);
	public Users updateUser(Users user);
}
