package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.lti.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao 
{
	@PersistenceContext
	private EntityManager entityManager;

	public EmployeeDaoImpl() 
	{
		
	}
	
	@Override
	public int createEmployee(Employee employee) 
	{
		entityManager.persist(employee);
		return 1;
	}

	@Override
	public List<Employee> readAllEmployees() 
	{
		String jpql = "From Employee";
		TypedQuery<Employee> tquery = entityManager.createQuery(jpql, Employee.class);
		List<Employee> list = tquery.getResultList();
		return list;
	}

	@Override
	public int deleteEmployee(int employeeId) 
	{
		Query query=entityManager.createNamedQuery("DELETE_BY_EMPID");
		query.setParameter("eid", employeeId);
		int result = query.executeUpdate();
		return result;
	}

	@Override
	public Employee updateEmployee(Employee employee)
	{
		return entityManager.merge(employee);
		
	}

}
