package com.dreamteam.mannhibooking.dto;

public class UserDTO extends AbstractDTO<UserDTO> {
	
	private String userName;
	private String password;
	private String fullName;
	private Integer status;
	private Integer validflag;
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
	public Integer getValidflag() {
		return validflag;
	}
	public void setValidflag(Integer validflag) {
		this.validflag = validflag;
	}

}
