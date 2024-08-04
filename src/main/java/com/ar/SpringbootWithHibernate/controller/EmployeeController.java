package com.ar.SpringbootWithHibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ar.SpringbootWithHibernate.entity.Employee;
import com.ar.SpringbootWithHibernate.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/employee")
	public String insert(@RequestBody Employee employee) {
		employeeService.insert(employee);
		return "Employee Recored Inserted Successfully..!";
	}

	@GetMapping("/employee/{employeeId}")
	public Employee getEmployee(@PathVariable("employeeId") Long id) {
		Employee employeeId = employeeService.getEmployee(id);
		return employeeId;

	}

	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		List<Employee> employees = employeeService.getAllEmployee();
		return employees;

	}

	@DeleteMapping("/employee/{id}")
	public String deleteEmployeeId(@PathVariable("id") Long id) {
		employeeService.deleteEmployeeId(id);
		return "EmployeeId deleted successfully";
	}

	@GetMapping("/employee/name/{firstName}")
	public Employee getEmployeeName(@PathVariable("firstName") String firstName) {
		Employee employeeName = employeeService.getEmployeeName(firstName);
		return employeeName;
	}
}
