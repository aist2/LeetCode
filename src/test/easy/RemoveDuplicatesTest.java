package easy;

import static org.junit.Assert.*;

import org.junit.Test;

import easy.RemoveDuplicates;


public class RemoveDuplicatesTest {

	@Test
	public void removeDuplicatesTest1() {
		int[] nums = {1,1,2};
		int base = 2;
		int res = RemoveDuplicates.removeDuplicates(nums);
		assertEquals(base,res);
	}

	@Test
	public void removeDuplicatesTest2() {
		int[] nums = {1};
		int base = 1;
		int res = RemoveDuplicates.removeDuplicates(nums);
		assertEquals(base,res);
	}
	
	@Test
	public void removeDuplicatesTest3() {
		int[] nums = {1,2,2,2,2,2,2,2};
		int base = 2;
		int res = RemoveDuplicates.removeDuplicates(nums);
		assertEquals(base,res);
	}
	
	@Test
	public void removeDuplicatesTest4() {
		int[] nums = {1,2,2,2,2,2,2,2,3,3,3,4,5,6};
		int base = 6;
		int res = RemoveDuplicates.removeDuplicates(nums);
		assertEquals(base,res);
	}
}
