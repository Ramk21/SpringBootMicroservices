package com.payroll.microservice.employeeRoleService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EmployeeRoleServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeRoleServiceApplication.class, args);
	}

}
