package com.dreamteam.mannhibooking.entity;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "HOTELPF")
public class HotelEntity extends BaseEntity {
	
	@Column(name = "name", columnDefinition = "NVARCHAR(255)")
	private String name;
	
	@Column(name = "addr01", columnDefinition = "NVARCHAR(255)")
	private String addr01;
	
	@Column(name = "addr02", columnDefinition = "NVARCHAR(255)")
	private String addr02;
	
	@Column(name = "addr03", columnDefinition = "NVARCHAR(255)")
	private String addr03;
	
	@Column(name = "addr04", columnDefinition = "NVARCHAR(255)")
	private String addr04;
	
	@Column(name = "detail", columnDefinition = "NVARCHAR(255)")
	private String detail ;
	
	@Column(name = "opentime")
    private LocalTime  openTime;
	
	@Column(name = "closetime")
    private LocalTime  closeTime;
	
	@Column(name = "status")
	private Integer status;
	
	@Column(name = "checkin")
    private LocalTime  checkIn;
	
	@Column(name = "checkout")
    private LocalTime  checkOut;
	
	@Column(name = "validflag")
	private Integer validFlag;
	
	@Column(name = "displayflag")
	private Integer displayFlag;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "provice_id", nullable = false)
    private ProviceEntity provice;
	
	@OneToMany(mappedBy = "hotel",targetEntity = RoomEntity.class)
	private List<RoomEntity> RoomList = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr01() {
		return addr01;
	}

	public void setAddr01(String addr01) {
		this.addr01 = addr01;
	}

	public String getAddr02() {
		return addr02;
	}

	public void setAddr02(String addr02) {
		this.addr02 = addr02;
	}

	public String getAddr03() {
		return addr03;
	}

	public void setAddr03(String addr03) {
		this.addr03 = addr03;
	}

	public String getAddr04() {
		return addr04;
	}

	public void setAddr04(String addr04) {
		this.addr04 = addr04;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public LocalTime getOpenTime() {
		return openTime;
	}

	public void setOpenTime(LocalTime openTime) {
		this.openTime = openTime;
	}

	public LocalTime getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(LocalTime closeTime) {
		this.closeTime = closeTime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public LocalTime getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(LocalTime checkIn) {
		this.checkIn = checkIn;
	}

	public LocalTime getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(LocalTime checkOut) {
		this.checkOut = checkOut;
	}

	public Integer getValidFlag() {
		return validFlag;
	}

	public void setValidFlag(Integer validFlag) {
		this.validFlag = validFlag;
	}

	public Integer getDisplayFlag() {
		return displayFlag;
	}

	public void setDisplayFlag(Integer displayFlag) {
		this.displayFlag = displayFlag;
	}

	public ProviceEntity getProvice() {
		return provice;
	}

	public void setProvice(ProviceEntity provice) {
		this.provice = provice;
	}

	public List<RoomEntity> getRoomList() {
		return RoomList;
	}

	public void setRoomList(List<RoomEntity> roomList) {
		RoomList = roomList;
	}
	
	
}
