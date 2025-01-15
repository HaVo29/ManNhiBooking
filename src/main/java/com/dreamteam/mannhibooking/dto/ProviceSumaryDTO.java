package com.dreamteam.mannhibooking.dto;

public class ProviceSumaryDTO  {

	private String name;
	private Integer validflag;
	private String code;
	
	public ProviceSumaryDTO(String name,String code,Integer validflag) {
		this.name = name ;
		this.validflag = validflag;
		this.code = code;
	}
	
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
