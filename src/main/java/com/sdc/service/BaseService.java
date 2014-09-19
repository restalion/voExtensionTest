package com.sdc.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.sdc.vo.BaseVO;

/**
 * Sample service.
 * @author restalion
 */
public class BaseService {

	/**
	 * Create a set from a list.
	 * 
	 * @param list
	 * @return set with values from the list
	 */
	public Set<BaseVO> mountSet(List<BaseVO> list) {
		Set<BaseVO> returnSet = new HashSet<BaseVO>();

		returnSet.addAll(list);

		return returnSet;
	}

}
