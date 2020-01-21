
package com.payroll.microservice.employeeRoleService;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "payroll")
@Data
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class EmployeeRoleComp {
	@Id
	@Column(name = "payroll_Id")
	@GeneratedValue
	private Integer payrollId;
	@Column(name = "emp_id")
	private Integer empId;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "role_Id")	
	private Integer roleId;
	@Column(name = "role_Name")
	private String roleName;
	@Column(name = "role_desc")
	private String descripton;
	
	public EmployeeRoleComp(Integer payrollId, Integer empId, String firstName, String lastName, Integer roleId,
			String roleName, String descripton) {
		super();
		this.payrollId = payrollId;
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.roleId = roleId;
		this.roleName = roleName;
		this.descripton = descripton;
	}
	
//	public EmployeeRoleComp() {}
	
	public Integer getPayrollId() {
		return payrollId;
	}
	public void setPayrollId(Integer payrollId) {
		this.payrollId = payrollId;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	public String getDescription() {
		return descripton;
	}
	public void setDescription(String descripton) {
		this.descripton = descripton;
	}
	
	
}