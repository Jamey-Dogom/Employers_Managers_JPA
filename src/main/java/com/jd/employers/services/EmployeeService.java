package com.jd.employers.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jd.employers.models.Employee;
import com.jd.employers.repositories.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepo;

	public Employee findEmployeeById(Long id) {
		return employeeRepo.findById(id).get();
	}

	public void getManager(Long id) {
		// Implement a getter method that will allow an employee to get their manager.
		Optional<Employee> employee = employeeRepo.findById(id);
		System.out.println(employee.get().getManager().getFirst_name());

	}

	public void getEmployees(Long id) {
		// Implement a getter method that will allow an employee to get their manager.
		Optional<Employee> manager = employeeRepo.findById(id);
		for (Employee e : manager.get().getEmployees()) {
			System.out.println(e.getFirst_name());
		}
	}

	public void saveEmployee(Employee one) {
		employeeRepo.save(one);
	}
}
