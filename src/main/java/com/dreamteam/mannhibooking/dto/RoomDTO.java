package com.dreamteam.mannhibooking.dto;

import java.math.BigDecimal;

public class RoomDTO extends AbstractDTO<RoomDTO> {

	private String name;
	private Integer totalPeople;
	private Integer totalBed;
	private BigDecimal price;
	private Integer displayFlag;
	private Integer validflag;
	private Long hotelId;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getTotalPeople() {
		return totalPeople;
	}
	public void setTotalPeople(Integer totalPeople) {
		this.totalPeople = totalPeople;
	}
	public Integer getTotalBed() {
		return totalBed;
	}
	public void setTotalBed(Integer totalBed) {
		this.totalBed = totalBed;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Integer getDisplayFlag() {
		return displayFlag;
	}
	public void setDisplayFlag(Integer displayFlag) {
		this.displayFlag = displayFlag;
	}
	public Integer getValidflag() {
		return validflag;
	}
	public void setValidflag(Integer validflag) {
		this.validflag = validflag;
	}
	public Long getHotelId() {
		return hotelId;
	}
	public void setHotelId(Long hotelId) {
		this.hotelId = hotelId;
	}
	
}
