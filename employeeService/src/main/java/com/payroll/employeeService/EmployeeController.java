package com.payroll.employeeService;



import java.sql.Date;

import org.apache.log4j.Logger;

//import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

//import com.payroll.microservice.employeeRoleService.EmployeeRoleServiceController;

@RestController
@EnableHystrix
public class EmployeeController {

	private static final Logger logger = Logger.getLogger(EmployeeController.class);
	
	@Autowired
	EmployeeRepository  employeeRepository;
	@Autowired
	EmployeeConfiguration employeeConfiguration;
	
	@RequestMapping(value="/employee/{id}",method=RequestMethod.GET)
	public Employee getEmployee(@PathVariable Integer id) {
		logger.info("Inside the employee service");
//		return new Employee(101,"Ram","Kumar", new Date());
		Employee emp = employeeRepository.findOne(id);
		System.out.println("emp******"+emp.toString());
		return emp;
		
	}
	
	@RequestMapping(value="/employee/fault-tolerance",method=RequestMethod.GET)	
	@HystrixCommand(fallbackMethod="fallBackMethod")
	public Employee getEmployeeWithFaultTolerance() {
		throw new RuntimeException("issue happened");
	}
	
	public Employee fallBackMethod() {
		//return new Employee(444,"Ram","Kumar",null);
		return new Employee(444,employeeConfiguration.getDefaultFirstName(),
				employeeConfiguration.getDefaultLastName(),null);
	}
	
}
