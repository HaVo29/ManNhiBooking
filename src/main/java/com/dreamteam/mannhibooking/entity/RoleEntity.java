package com.dreamteam.mannhibooking.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "ROLEPF")
public class RoleEntity extends BaseEntity {
	
	@Column
	private String code;
	
	@Column(name = "name", columnDefinition = "NVARCHAR(255)")
	private String name;
	
	@Column(name = "validflag")
	private Integer validflag;
	
	@ManyToMany(mappedBy = "roles")
    private List<UserEntity> users = new ArrayList<>();

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<UserEntity> getUsers() {
		return users;
	}

	public void setUsers(List<UserEntity> users) {
		this.users = users;
	}

	public Integer getValidflag() {
		return validflag;
	}

	public void setValidflag(Integer validflag) {
		this.validflag = validflag;
	}
	
}
