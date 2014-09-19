package com.sdc.vo;

import java.util.List;

/**
 * Sample VO.
 * @author restalion
 */
public class BaseVO {

	/** property1. */
	private String property1;
	/** property2. */
	private Integer property2;
	/** property3. */
	private Double property3;

	/**
	 * Constructor without parameters.
	 */
	public BaseVO(){
		
	}
	
	/**
	 * Constructor with parameters.
	 *
	 * @param property1
	 * @param property2
	 * @param property3
	 */
	public BaseVO(String property1, Integer property2, Double property3) { 
		this.property1 = property1;
		this.property2 = property2;
		this.property3 = property3;
	}
	
	/**
	 * getProperty1.
	 * @return
	 */
	public String getProperty1() {
		return property1;
	}

	/**
	 * setProperty1.
	 * @param property1
	 */
	public void setProperty1(String property1) {
		this.property1 = property1;
	}

	/**
	 * getProperty2.
	 * @return
	 */
	public Integer getProperty2() {
		return property2;
	}

	/**
	 * setProperty2.
	 * @param property2
	 */
	public void setProperty2(Integer property2) {
		this.property2 = property2;
	}

	/**
	 * getProperty3.
	 * @return
	 */
	public Double getProperty3() {
		return property3;
	}

	/**
	 * setProperty3.
	 * @param property3
	 */
	public void setProperty3(Double property3) {
		this.property3 = property3;
	}
}
