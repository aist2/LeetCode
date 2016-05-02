package medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContainDuplicate3Test {

	@Test
	public void test() {
		assertTrue(ContainDuplicate3.containsNearbyAlmostDuplicate(new int[] {1,3,5,7,9}, 3, 2));
	}
	@Test
	public void test1() {
		assertFalse(ContainDuplicate3.containsNearbyAlmostDuplicate(new int[] {1,3,5,7,9}, 3, 1));
	}
	
	@Test
	public void test2() {
		assertTrue(ContainDuplicate3.containsNearbyAlmostDuplicate(new int[] {1,3,5,1,9}, 3, 1));
	}
	
	@Test
	public void test3() {
		assertFalse(ContainDuplicate3.containsNearbyAlmostDuplicate(new int[] {1,3,5,7,1,9}, 3, 1));
	}
}
