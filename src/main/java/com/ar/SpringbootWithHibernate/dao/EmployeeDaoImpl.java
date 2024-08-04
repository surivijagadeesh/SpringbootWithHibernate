package com.ar.SpringbootWithHibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ar.SpringbootWithHibernate.entity.Employee;

import jakarta.persistence.EntityManager;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private EntityManager entityManager;

	@Override
	public void insert(Employee employee) {
		Session currentSession = entityManager.unwrap(Session.class);

		currentSession.save(employee);
	}

	@Override
	public Employee getEmployee(Long id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Employee employee = currentSession.get(Employee.class, id);
		return employee;
	}

	@Override
	public List<Employee> getAllEmployees() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Employee> query = currentSession.createQuery("from Employee", Employee.class);

		List<Employee> resultList = query.getResultList();

		return resultList;
	}

	@SuppressWarnings("deprecation")
	@Override
	public void deleteEmployeeId(Long id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Employee employee = currentSession.get(Employee.class, id);
		currentSession.delete(employee);
	}

	@Override
	public Employee getEmployeeName(String firstName) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Employee> createQuery = currentSession.createQuery("from Employee where firstName=:firstName",
				Employee.class);

		createQuery.setParameter("firstName", firstName);

		Employee employee = createQuery.getSingleResult();

		return employee;
	}

}
