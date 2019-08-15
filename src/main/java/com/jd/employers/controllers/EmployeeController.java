package com.jd.employers.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jd.employers.models.Employee;
import com.jd.employers.services.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/")
	public String index() {
		Employee one = employeeService.findEmployeeById((long) 1);
		Employee two = employeeService.findEmployeeById((long) 2);
		Employee three = employeeService.findEmployeeById((long) 3);
//		List<Employee> lst = new ArrayList<>();
//		lst.add(two);
//		one.setEmployees(lst);
//		employeeService.saveEmployee(one);
//		two.setManager(one);
//		employeeService.saveEmployee(two);
		employeeService.getManager(three.getId());
		employeeService.getEmployees(one.getId());
		return "index.jsp";
	}

}
