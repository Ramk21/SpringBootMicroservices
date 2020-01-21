package com.payroll.microservice.employeeRoleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@EnableFeignClients("com.payroll.microservice.employeeRoleService")
public class EmployeeRoleServiceController {
	
	@Autowired
	EmployeeRoleRepository employeeRoleRepository;
	
	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	RoleService roleService;

	@PostMapping("emp/{empId}/role/{roleName}")
	public void  getEmpRole(@PathVariable Integer empId, @PathVariable String roleName) {
		
		//EmployeeRoleComp employeeRoleComp= new EmployeeRoleComp(901,500,"ragu","nath",10,"HR","Human resource");
//		ResponseEntity<EmployeeRoleComp> empResponse =new RestTemplate().getForEntity("http://localhost:8088/employee/{empId}", EmployeeRoleComp.class,empId);
//		ResponseEntity<EmployeeRoleComp> roleResponse =new RestTemplate().getForEntity("http://localhost:8089/role/{roleName}", EmployeeRoleComp.class,roleName);
		EmployeeRoleComp employeeRoleComp = employeeService.getEmployee(empId); 	
		EmployeeRoleComp roleComp = roleService.getRoleName(roleName);
		employeeRoleComp.setRoleId(roleComp.getRoleId());
		employeeRoleComp.setRoleName(roleComp.getRoleName());
		employeeRoleComp.setDescription(roleComp.getDescription());//should keep the same pojo variable names as per employee.java OR employeeRole.java else giving null
		employeeRoleRepository.save(employeeRoleComp);
		
	}
	
}
