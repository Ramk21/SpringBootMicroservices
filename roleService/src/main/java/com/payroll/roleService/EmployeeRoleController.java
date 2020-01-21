package com.payroll.roleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeRoleController {

	@Autowired
	EmployeeRoleRepository employeeRoleRepository;
	
//	@GetMapping("/role/{roleName}")
	
	@RequestMapping(value="/role/{roleName}",method=RequestMethod.GET)
	public EmployeeRole getRoleName(@PathVariable String roleName) {
		
		EmployeeRole employeeRole=  employeeRoleRepository.getOne(roleName);
		System.out.println("employeeRole...."+employeeRole.toString());
		return employeeRole;
		//return new EmployeeRole(101,"Ramkumar","role description");
		
		
	}
}
