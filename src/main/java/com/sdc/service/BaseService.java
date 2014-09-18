package com.sdc.service;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.sdc.vo.BaseVO;

public class BaseService {

	public Set<BaseVO> mountSet(List<BaseVO> list) {
		Set<BaseVO> returnSet = new HashSet<BaseVO>();

		returnSet.addAll(list);

		return returnSet;
	}
	
	public Set<BaseVO> mountSetExtended(List<ExtendedBaseVO> list) {
		Set<ExtendedBaseVO> returnSet = new HashSet<ExtendedBaseVO>();

		for (ExtendedBaseVO vo: list) {
			returnSet.add(vo);
		}

		return toBaseVOformExtendedBaseVO(returnSet);
	}
	
	private Set<BaseVO> toBaseVOformExtendedBaseVO(Set<ExtendedBaseVO> input) {
		Set<BaseVO> returnSet = new HashSet<BaseVO>();
		
		Iterator<ExtendedBaseVO> iterator = input.iterator();
		while (iterator.hasNext()) {
			returnSet.add((BaseVO)iterator.next());
		}
		
		return returnSet;
	}
}
