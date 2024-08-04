package com.ar.SpringbootWithHibernate.dao;

import java.util.List;

import com.ar.SpringbootWithHibernate.entity.Employee;

public interface EmployeeDao {

	public void insert(Employee employee);

	public Employee getEmployee(Long id);

	public List<Employee> getAllEmployees();

	public void deleteEmployeeId(Long id);

	public Employee getEmployeeName(String name);
}
