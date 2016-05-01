package easy;

import static org.junit.Assert.*;

import org.junit.Test;

import easy.MajorityElement;


public class MajorityElementTest {

	@Test
	public void testMajorityElement1() {
		int[] nums = {4,4,4,4,4,3,3,3,5};
		int res = MajorityElement.majorityElement2(nums);
		assertEquals(4,res);
	}

	@Test
	public void testMajorityElement2() {
		int[] nums = {6,5,5};
		int res = MajorityElement.majorityElement2(nums);
		assertEquals(5,res);
	}
	
	@Test
	public void testMajorityElement3() {
		int[] nums = {1};
		int res = MajorityElement.majorityElement2(nums);
		assertEquals(1,res);
	}
	
	@Test
	public void testMajorityElement4() {
		int[] nums = {1,1};
		int res = MajorityElement.majorityElement2(nums);
		assertEquals(1,res);
	}
	
	@Test
	public void testMajorityElement5() {
		int[] nums = {1,1,1,1,2,3};
		int res = MajorityElement.majorityElement2(nums);
		assertEquals(1,res);
	}
	
	
}
