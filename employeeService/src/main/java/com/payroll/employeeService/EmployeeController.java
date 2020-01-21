package com.payroll.employeeService;

//import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	
	@Autowired
	EmployeeRepository  employeeRepository;
	
	@RequestMapping(value="/employee/{id}",method=RequestMethod.GET)
	public Employee getEmployee(@PathVariable Integer id) {
//		return new Employee(101,"Ram","Kumar", new Date());
		Employee emp = employeeRepository.findOne(id);
		System.out.println("emp******"+emp.toString());
		return emp;
		
	}
}
