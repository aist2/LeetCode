package easy;

import static org.junit.Assert.*;

import org.junit.Test;

import easy.ContainDuplicate2;


public class ContainDuplicate2Test {

	@Test
	public void testContainsNearbyDuplicate1() {
		int[] nums={1,1,3,4,5};
		int k=2;
		boolean res = ContainDuplicate2.containsNearbyDuplicate(nums, k);
		assertTrue(res);
	}

	@Test
	public void testContainsNearbyDuplicate2() {
		int[] nums={1};
		int k=2;
		boolean res = ContainDuplicate2.containsNearbyDuplicate(nums, k);
		assertFalse(res);
	}
	
	@Test
	public void testContainsNearbyDuplicate3() {
		int[] nums={1,2,1,3,5};
		int k=2;
		boolean res = ContainDuplicate2.containsNearbyDuplicate(nums, k);
		assertTrue(res);
	}
	
	@Test
	public void testContainsNearbyDuplicate4() {
		int[] nums={1,2,3,4,5};
		int k=2;
		boolean res = ContainDuplicate2.containsNearbyDuplicate(nums, k);
		assertFalse(res);
	}
	
	@Test
	public void testContainsNearbyDuplicate5() {
		int[] nums={1,2,3,1,5};
		int k=2;
		boolean res = ContainDuplicate2.containsNearbyDuplicate(nums, k);
		assertFalse(res);
	}
	
	@Test
	public void testContainsNearbyDuplicate6() {
		int[] nums={1,0,1,1};
		int k=1;
		boolean res = ContainDuplicate2.containsNearbyDuplicate(nums, k);
		assertTrue(res);
	}
}
