package com.dreamteam.mannhibooking.dto;

import java.time.LocalTime;

public class HotelDTO extends AbstractDTO<HotelDTO> {

	private String name;
	private String addr01;
	private String addr02;
	private String addr03;
	private String addr04;
	private String detail ;
    private LocalTime  openTime;
    private LocalTime  closeTime;
	private Integer status;
    private LocalTime  checkIn;
    private LocalTime  checkOut;
	private Integer validFlag;
	private Integer displayFlag;
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
	
}
