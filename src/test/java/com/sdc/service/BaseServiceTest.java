package com.sdc.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import com.sdc.service.impl.BaseService;
import com.sdc.vo.BaseVO;
import com.sdc.vo.ExtendedBaseVO;

/**
 * BaseServiceTest.
 * @author restalion
 */
public class BaseServiceTest {

	/**
	 * testMountSetWithBaseVO, create a 7-size list and expect to return a 7-size set.
	 */
	@Test
	public void testMountSetWithBaseVO() {
		BaseService service = new BaseService();
		List<BaseVO> list = createTestList();
		Set<BaseVO> set = service.mountSet(list);
		assertEquals(7, set.size());
	}
	
	/**
	 * testMountSetWithBaseVODuplicated, create a 10-size list and expect to return a 10-size set.
	 */
	@Test
	public void testMountSetWithBaseVODuplicated() {
		BaseService service = new BaseService();
		List<BaseVO> list = createTestListWithDuplicatedValues();
		Set<BaseVO> set = service.mountSet(list);
		assertEquals(10, set.size());
	}

	/**
	 * testMountSetWithExtendedBaseVO, create a 7-size list and expect to return a 7-size set.
	 */
	@Test
	public void testMountSetWithExtendedBaseVO() {
		BaseService service = new BaseService();
		List<BaseVO> list = createTestListExtended();
		Set<BaseVO> set = service.mountSet(list);
		assertEquals(7, set.size());
	}
	
	/**
	 * testMountSetWithExtendedBaseVODuplicated, create a 10-size list and expect to return a 7-size set.
	 */
	@Test
	public void testMountSetWithExtendedBaseVODuplicated() {
		BaseService service = new BaseService();
		List<BaseVO> list = createTestListWithDuplicatedValuesExtended();
		Set<BaseVO> set = service.mountSet(list);
		assertEquals(7, set.size());
	}
	
	///////////////////////////////////////////////////////////////////////////////////
	
	// BaseVO
	/**
	 * create a BaseVO testList.
	 * @return
	 */
	private List<BaseVO> createTestList() {
		List<BaseVO> testList = new ArrayList<BaseVO>();
		
		BaseVO base1 = new BaseVO("One", 1, 1.0);
		BaseVO base2 = new BaseVO("Two", 2, 2.0);
		BaseVO base3 = new BaseVO("Three", 3, 3.0);
		BaseVO base4 = new BaseVO("Four", 4, 4.0);
		BaseVO base5 = new BaseVO("Five", 5, 5.0);
		BaseVO base6 = new BaseVO("Six", 6, 6.0);
		BaseVO base7 = new BaseVO("Seven", 7, 7.0);
		
		testList.add(base1);
		testList.add(base2);
		testList.add(base3);
		testList.add(base4);
		testList.add(base5);
		testList.add(base6);
		testList.add(base7);
		
		return testList;
	}
	
	/**
	 * Create a BaseVO test list with duplicated values.
	 * @return
	 */
	private List<BaseVO> createTestListWithDuplicatedValues() {
		List<BaseVO> testList = new ArrayList<BaseVO>();
		
		BaseVO base1 = new BaseVO("One", 1, 1.0);
		BaseVO base2 = new BaseVO("Two", 2, 2.0);
		BaseVO base3 = new BaseVO("Three", 3, 3.0);
		BaseVO base4 = new BaseVO("Four", 4, 4.0);
		BaseVO base5 = new BaseVO("Five", 5, 5.0);
		BaseVO base6 = new BaseVO("Six", 6, 6.0);
		BaseVO base7 = new BaseVO("Seven", 7, 7.0);
		BaseVO base8 = new BaseVO("Five", 5, 5.0);
		BaseVO base9 = new BaseVO("Six", 6, 6.0);
		BaseVO base10 = new BaseVO("Seven", 7, 7.0);
		
		testList.add(base1);
		testList.add(base2);
		testList.add(base3);
		testList.add(base4);
		testList.add(base5);
		testList.add(base6);
		testList.add(base7);
		testList.add(base8);
		testList.add(base9);
		testList.add(base10);
		
		return testList;
	}
	
	// ExtendedVO
	/**
	 * Create a ExtendedBaseVO list.
	 * @return
	 */
	private List<BaseVO> createTestListExtended() {
		List<BaseVO> testList = new ArrayList<BaseVO>();
		
		BaseVO base1 = new ExtendedBaseVO("One", 1, 1.0);
		BaseVO base2 = new ExtendedBaseVO("Two", 2, 2.0);
		BaseVO base3 = new ExtendedBaseVO("Three", 3, 3.0);
		BaseVO base4 = new ExtendedBaseVO("Four", 4, 4.0);
		BaseVO base5 = new ExtendedBaseVO("Five", 5, 5.0);
		BaseVO base6 = new ExtendedBaseVO("Six", 6, 6.0);
		BaseVO base7 = new ExtendedBaseVO("Seven", 7, 7.0);
		
		testList.add(base1);
		testList.add(base2);
		testList.add(base3);
		testList.add(base4);
		testList.add(base5);
		testList.add(base6);
		testList.add(base7);
		
		return testList;
	}
	
	/**
	 * Create a ExtendedBaseVO list with duplicated values.
	 * @return
	 */
	private List<BaseVO> createTestListWithDuplicatedValuesExtended() {
		List<BaseVO> testList = new ArrayList<BaseVO>();
		
		BaseVO base1 = new ExtendedBaseVO("One", 1, 1.0);
		BaseVO base2 = new ExtendedBaseVO("Two", 2, 2.0);
		BaseVO base3 = new ExtendedBaseVO("Three", 3, 3.0);
		BaseVO base4 = new ExtendedBaseVO("Four", 4, 4.0);
		BaseVO base5 = new ExtendedBaseVO("Five", 5, 5.0);
		BaseVO base6 = new ExtendedBaseVO("Six", 6, 6.0);
		BaseVO base7 = new ExtendedBaseVO("Seven", 7, 7.0);
		BaseVO base8 = new ExtendedBaseVO("Five", 5, 5.0);
		BaseVO base9 = new ExtendedBaseVO("Six", 6, 6.0);
		BaseVO base10 = new ExtendedBaseVO("Seven", 7, 7.0);
		
		testList.add(base1);
		testList.add(base2);
		testList.add(base3);
		testList.add(base4);
		testList.add(base5);
		testList.add(base6);
		testList.add(base7);
		testList.add(base8);
		testList.add(base9);
		testList.add(base10);
		
		return testList;
	}
}
