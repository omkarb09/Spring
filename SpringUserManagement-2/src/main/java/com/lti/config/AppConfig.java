package com.lti.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.lti.model.Users;

@Configuration
@ComponentScan(basePackages=("com.lti"))
public class AppConfig 
{
	@Bean(name="user")
	public Users getUsers()
	{
		Users user = new Users();
		return user;
	}
	
	@Bean
	public JdbcTemplate getJdbcTemplate(DataSource dataSource)
	{
		JdbcTemplate jdbcTemplate= new JdbcTemplate(dataSource);
		return jdbcTemplate;
	}
	
	@Bean
	public DataSource getDataSource()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		dataSource.setUsername("hr");
		dataSource.setPassword("hr");
		return dataSource;
	}
}
