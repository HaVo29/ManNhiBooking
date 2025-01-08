package com.dreamteam.mannhibooking.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ROOMPF")
public class RoomEntity extends BaseEntity {

	@Column(name = "name", columnDefinition = "NVARCHAR(255)")
	private String name;
	
	@Column(name = "totalpeople")
	private Integer totalPeople;
	
	@Column(name = "totalbed")
	private Integer totalBed;
	
	@Column(name = "price")
	private BigDecimal price;
	
	@Column(name = "displayflag")
	private Integer displayFlag;
	
	@Column(name = "validflag")
	private Integer validflag;
	
	@ManyToOne
    @JoinColumn(name = "hotel_id", nullable = false)
    private HotelEntity hotel;
	
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

	public HotelEntity getHotel() {
		return hotel;
	}

	public void setHotel(HotelEntity hotel) {
		this.hotel = hotel;
	}
	
}
