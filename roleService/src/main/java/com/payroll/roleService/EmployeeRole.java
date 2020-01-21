package com.payroll.roleService;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "role")
@Data
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class EmployeeRole {
	
	@Id
	@Column(name = "role_name")
	private String roleName;
	
	@Column(name = "role_id")
	private Integer roleId;
	
	@Column(name = "role_desc")
	private String descripton;
	
	
	/*
	public EmployeeRole(Integer roleId, String roleName, String descripton) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.descripton = descripton;
	}
	
	public EmployeeRole() {}
	
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
	public String getDescripton() {
		return descripton;
	}
	public void setDescripton(String descripton) {
		this.descripton = descripton;
	}*/
	

}
