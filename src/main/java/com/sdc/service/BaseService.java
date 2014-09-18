package com.sdc.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.sdc.vo.BaseVO;

public class BaseService {

	public Set<BaseVO> mountSet(List<BaseVO> list) {
		Set<BaseVO> returnSet = new HashSet<BaseVO>();

		returnSet.addAll(list);

		return returnSet;
	}

}
