package com.dreamteam.mannhibooking.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "PROVPF")
public class ProviceEntity extends BaseEntity {

	@Column(name = "name", columnDefinition = "NVARCHAR(255)")
	private String name;
	
	@Column(name = "validflag")
	private Integer validflag;
	
	@Column(name = "code")
	private String code;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getValidflag() {
		return validflag;
	}

	public void setValidflag(Integer validflag) {
		this.validflag = validflag;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
}
