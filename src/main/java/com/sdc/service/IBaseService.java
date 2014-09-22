package com.sdc.service;

import java.util.List;
import java.util.Set;

import com.sdc.vo.BaseVO;

public interface IBaseService {

	/**
	 * Create a set from a list.
	 * 
	 * @param list
	 * @return set with values from the list
	 */
	public Set<BaseVO> mountSet(List<BaseVO> list);

}
