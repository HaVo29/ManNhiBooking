package com.dreamteam.mannhibooking.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "USERPF")
public class UserEntity extends BaseEntity {

	@Column(name = "username")
	private String userName;

	@Column
	private String password;

	@Column(name = "fullname", columnDefinition = "NVARCHAR(255)")
	private String fullName;

	@Column
	private Integer status;
	
	@Column(name = "validflag")
	private Integer validflag;

	@ManyToMany(fetch = FetchType.LAZY, targetEntity = RoleEntity.class)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "userid"), 
				inverseJoinColumns = @JoinColumn(name = "roleid"))
	private List<RoleEntity> roles = new ArrayList<>();

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public List<RoleEntity> getRoles() {
		return roles;
	}

	public void setRoles(List<RoleEntity> roles) {
		this.roles = roles;
	}

	public Integer getValidflag() {
		return validflag;
	}

	public void setValidflag(Integer validflag) {
		this.validflag = validflag;
	}
	
}