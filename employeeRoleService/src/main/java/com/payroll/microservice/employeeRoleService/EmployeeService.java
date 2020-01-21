package com.payroll.microservice.employeeRoleService;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//import com.payroll.employeeService.Employee;

@FeignClient(name="employeeService"/*,url="http://localhost:8088"*/)
@RibbonClient(name="employeeService")
public interface EmployeeService {
	@RequestMapping(value="/employee/{id}",method=RequestMethod.GET)
	public EmployeeRoleComp getEmployee(@PathVariable("id") Integer id);
}
