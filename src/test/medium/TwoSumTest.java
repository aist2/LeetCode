package medium;
import static org.junit.Assert.*;
import medium.TwoSum;

import org.junit.Test;


public class TwoSumTest {

	@Test
	public final void testTwoSum1() {
		int[] nums = {2,7,11,15};
		int[] expected = {0,1};
		assertArrayEquals(expected, TwoSum.twoSum(nums, 9));
	}
	@Test
	public final void testTwoSum2() {
		int[] nums = {0,3,4,0};
		int[] expected = {0,3};
		assertArrayEquals(expected, TwoSum.twoSum(nums, 0));
	}
	
	@Test
	public final void testTwoSum3() {
		int[] nums = {-3,4,3,90};
		int[] expected = {0,2};
		assertArrayEquals(expected, TwoSum.twoSum(nums, 0));
	}
	
	@Test
	public final void testTwoSum4() {
		int[] nums = {2,1,9,4,4,56,90,3};
		int[] expected = {3,4};
		assertArrayEquals(expected, TwoSum.twoSum(nums, 8));
	}
			
}
