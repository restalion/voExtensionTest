package com.sdc.vo;

import java.util.List;

public class BaseVO {

	private String property1;
	private Integer property2;
	private Double property3;

	public BaseVO(){
		
	}
	
	public BaseVO(String property1, Integer property2, Double property3) { 
		this.property1 = property1;
		this.property2 = property2;
		this.property3 = property3;
	}
	
	public String getProperty1() {
		return property1;
	}
	public void setProperty1(String property1) {
		this.property1 = property1;
	}
	public Integer getProperty2() {
		return property2;
	}
	public void setProperty2(Integer property2) {
		this.property2 = property2;
	}
	public Double getProperty3() {
		return property3;
	}
	public void setProperty3(Double property3) {
		this.property3 = property3;
	}
}
