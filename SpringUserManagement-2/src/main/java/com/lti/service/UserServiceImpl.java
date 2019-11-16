package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.UserDao;
import com.lti.dao.UserDaoImpl;
import com.lti.model.Users;
@Service("service")
public class UserServiceImpl implements UserService{
	@Autowired
	UserDao dao = null;
	public UserServiceImpl()
	{
		
	}
	
	public UserServiceImpl(UserDaoImpl dao)
	{
		this.dao=dao;
	}
	public boolean checkLogin(String username, String password){
		int result = dao.readLogin(username, password);
		if(result == 1)
			return true;
		else
			return false;
	}
	public List<Users> findAllUsers(){
		return dao.readAllUsers();
	}
	
	public Users findUserByUsername(String username) {
		return dao.readUserByUsername(username);
	}
	public boolean removeUser(String username){
		
		int result = dao.deleteUser(username);
		if(result ==1)
		{
			
			return true;
		}	
		else
		{
			
			return false;
		}
		
			
	}
	public boolean addUser(Users user){
		
		int result = dao.createUser(user);
		if(result ==1)
		{
			
			return true;
		}
		else
		{
			
			return false;
		}
			
	}
	
	public Users updateUser(Users user)
	{
		
		Users user2=dao.updateUser(user);
		
		return user2;
	}
	public void setDao(UserDao dao) {
		this.dao = dao;
	}
	
	
	
}
