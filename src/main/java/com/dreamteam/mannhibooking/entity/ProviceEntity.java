package com.dreamteam.mannhibooking.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
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
	
	@OneToMany(mappedBy = "provice",targetEntity = HotelEntity.class)
	private List<HotelEntity> HotelList = new ArrayList<>();

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

	public List<HotelEntity> getHotelList() {
		return HotelList;
	}

	public void setHotelList(List<HotelEntity> hotelList) {
		HotelList = hotelList;
	}
	
}
