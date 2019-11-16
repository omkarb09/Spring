package com.lti.service;

import java.util.List;

import com.lti.model.Users;

public interface UserService {
	public boolean checkLogin(String username, String password);
	public List<Users> findAllUsers();
	public Users findUserByUsername(String username);
	public boolean removeUser(String username);
	public boolean addUser(Users user);
	public Users updateUser(Users user);
}
