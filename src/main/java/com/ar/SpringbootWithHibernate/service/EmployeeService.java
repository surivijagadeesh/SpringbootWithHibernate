package com.ar.SpringbootWithHibernate.service;

import java.util.List;

import com.ar.SpringbootWithHibernate.entity.Employee;

public interface EmployeeService {

	public void insert(Employee employee);

	public Employee getEmployee(Long id);

	public List<Employee> getAllEmployee();

	public void deleteEmployeeId(Long id);

	public Employee getEmployeeName(String firstName);
}
