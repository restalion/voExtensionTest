package com.sdc.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.sdc.service.IBaseService;
import com.sdc.vo.BaseVO;

/**
 * Wrong Base Service This service does things like you never will do.
 * @author restalion
 *
 */
public class WrongBaseService implements IBaseService{

	public static final int MODE_SENSITIVE = 0;
	public static final int MODE_INSENSITIVE = 1;
	
	
	/**
	 * Create a set from a list.
	 * 
	 * @param list
	 * @return set with values from the list
	 */
	public Set<BaseVO> mountSet(List<BaseVO> list) {
		return mountSet(list, MODE_INSENSITIVE);
	}

	/**
	 *  Create a set from a list, this method has two modes that should be selected by user.	
	 * @param list
	 * @param mode
	 * @return set with values from the list
	 */
	public Set<BaseVO> mountSet(List<BaseVO> list, int mode) {
		
		Set<BaseVO> returnSet = new HashSet<BaseVO>();

		if (mode == MODE_INSENSITIVE) {
			returnSet.addAll(list);
		} else if (mode == MODE_SENSITIVE) {
			returnSet.addAll(removeRepeatedValues(list));
		}

		return returnSet;
	}

	private List<BaseVO> removeRepeatedValues(List<BaseVO> list) {
		List<BaseVO> newList = new ArrayList<BaseVO>();
		BaseVO base;
		for (int i = list.size() -1; i >= 0; i --) {
			base = list.get(i);
			if (!foundInList(base, newList)) {
				newList.add(base);
			}
		}
		return newList;
	}
	
	private boolean foundInList(BaseVO base, List<BaseVO> list) {
		boolean found = false;
		for (BaseVO actual :  list) {
			found = baseVOEquals(actual, base);
			if (found) break;
		}
		return found;
	}
	
	private boolean baseVOEquals(BaseVO base1, BaseVO base2) {
		boolean equals = base1.getProperty1().equals(base2.getProperty1()) &&
						 base1.getProperty2().equals(base2.getProperty2()) &&
						 base1.getProperty3().equals(base2.getProperty3());

		return equals;
	}
	
}
