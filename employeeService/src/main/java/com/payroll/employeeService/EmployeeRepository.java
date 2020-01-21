package com.payroll.employeeService;

import org.springframework.data.jpa.repository.JpaRepository;

//import com.rolemanagement.microservices.Employee;

/**
 * @author Ram
 *
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
