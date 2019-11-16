package com.lti.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lti.model.Users;

@Repository
public class UserDaoImpl implements UserDao
{
	@Autowired
	private JdbcTemplate template=null;
	private static final String INSERT_USER_RECORD = "INSERT INTO USERS(USERNAME, PASSWORD, FIRSTNAME, LASTNAME, MOBILENUMBER) VALUES(?,?,?,?,?)";
	private static final String UPDATE_USER_RECORD ="UPDATE USERS SET FIRSTNAME=?, LASTNAME=?, MOBILENUMBER=? WHERE USERNAME=?";
	private static final String DELETE_USER_RECORD = " DELETE FROM USERS WHERE USERNAME=?";
	private static final String SELECT_USER_RECORD = "SELECT * FROM USERS";
	private static final String SELECT_USERBYUSERNAME_RECORD = "SELECT * FROM USERS WHERE USERNAME=?";
	private static final String SELECT_CHECKLOGIN_RECORD = "SELECT * FROM USERS WHERE USERNAME=? AND PASSWORD=?";
	
	public UserDaoImpl(JdbcTemplate template) 
	{
		this.template=template;
	}
	
	public int readLogin(String username, String password)
	{
		List<Users> list  = template.query(SELECT_CHECKLOGIN_RECORD,new Object[]{username,password}, new UserRowMapper());
		if(list !=null && list.size()>0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	public List<Users> readAllUsers()
	{
		List<Users> list = template.query(SELECT_USER_RECORD, new UserRowMapper());
		return list;
	}
	
	public Users readUserByUsername(String username)
	{
		List<Users> list  = template.query(SELECT_USERBYUSERNAME_RECORD,new Object[]{username}, new UserRowMapper());
		return list.get(0);
	}
	
	public int deleteUser(String username){
		
		int result = template.update(DELETE_USER_RECORD,username);
		return result;
		
	}
	
	public int createUser(Users user)
	{
		int result = template.update(INSERT_USER_RECORD, user.getUsername(),user.getPassword(),user.getFirstname(),user.getLastname(),user.getMobilenumber());
		return result;
	}
	
	public Users updateUser(Users user) 
	{
		int result= template.update(UPDATE_USER_RECORD,user.getFirstname(),user.getLastname(),user.getMobilenumber(),user.getUsername());
		
		if(result==1)
		{
			Users user2= new Users(user.getUsername(),user.getPassword(),user.getFirstname(),user.getLastname(),user.getMobilenumber());
			return user2;
		}
		else
		{
			System.out.println("User update failed");
			return null;
		}
		
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	
}


	
	
	
	
	
	
	


