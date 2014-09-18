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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((property1 == null) ? 0 : property1.hashCode());
		result = prime * result
				+ ((property2 == null) ? 0 : property2.hashCode());
		result = prime * result
				+ ((property3 == null) ? 0 : property3.hashCode());
		return result;
	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		BaseVO other = (BaseVO) obj;
//		if (property1 == null) {
//			if (other.property1 != null)
//				return false;
//		} else if (!property1.equals(other.property1))
//			return false;
//		if (property2 == null) {
//			if (other.property2 != null)
//				return false;
//		} else if (!property2.equals(other.property2))
//			return false;
//		if (property3 == null) {
//			if (other.property3 != null)
//				return false;
//		} else if (!property3.equals(other.property3))
//			return false;
//		return true;
//	}
	
	

}
