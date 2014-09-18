package com.sdc.service;

import com.sdc.vo.BaseVO;

public class ExtendedBaseVO extends BaseVO {
	
	public ExtendedBaseVO(String property1, Integer property2, Double property3) {
		super.setProperty1(property1);
		super.setProperty2(property2);
		super.setProperty3(property3);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((getProperty1() == null) ? 0 : getProperty1().hashCode());
		result = prime * result
				+ ((getProperty2() == null) ? 0 : getProperty2().hashCode());
		result = prime * result
				+ ((getProperty3() == null) ? 0 : getProperty3().hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExtendedBaseVO other = (ExtendedBaseVO) obj;
		if (getProperty1() == null) {
			if (other.getProperty1() != null)
				return false;
		} else if (!getProperty1().equals(other.getProperty1()))
			return false;
		if (getProperty2() == null) {
			if (other.getProperty2() != null)
				return false;
		} else if (!getProperty2().equals(other.getProperty2()))
			return false;
		if (getProperty3() == null) {
			if (other.getProperty3() != null)
				return false;
		} else if (!getProperty3().equals(other.getProperty3()))
			return false;
		return true;
	}
}
