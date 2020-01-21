package com.payroll.microservice.employeeRoleService;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//import com.payroll.roleService.EmployeeRole;


@FeignClient(name="roleService",url="http://localhost:8089")
public interface RoleService {
	@RequestMapping(value="/role/{roleName}",method=RequestMethod.GET)
	public EmployeeRoleComp getRoleName(@PathVariable("roleName") String roleName);
}
