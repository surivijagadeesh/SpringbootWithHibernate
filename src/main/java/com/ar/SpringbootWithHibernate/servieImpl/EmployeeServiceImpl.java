package com.ar.SpringbootWithHibernate.servieImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ar.SpringbootWithHibernate.dao.EmployeeDao;
import com.ar.SpringbootWithHibernate.entity.Employee;
import com.ar.SpringbootWithHibernate.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public void insert(Employee employee) {

		employeeDao.insert(employee);
	}

	@Override
	public Employee getEmployee(Long id) {
		Employee empId = employeeDao.getEmployee(id);
		return empId;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> employees = employeeDao.getAllEmployees();
		return employees;
	}

	@Override
	public void deleteEmployeeId(Long id) {
		employeeDao.deleteEmployeeId(id);

	}

	@Override
	public Employee getEmployeeName(String firstName) {
		Employee employeeName = employeeDao.getEmployeeName(firstName);
		return employeeName;
	}

}
