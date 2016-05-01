package medium;
import static org.junit.Assert.*;
import medium.NextPermutation;

import org.junit.Test;


public class NextPermutationTest {

	@Test
	public final void testNextPermutation1() {
		int[] nums = {1,2,3};
		NextPermutation.nextPermutation(nums);
		assertArrayEquals(new int[]{1,3,2},nums);
	}
	
	@Test
	public final void testNextPermutation2() {
		int[] nums = {3,2,1};
		NextPermutation.nextPermutation(nums);
		assertArrayEquals(new int[]{1,2,3},nums);
	}
	
	@Test
	public final void testNextPermutation3() {
		int[] nums = {1,1,5};
		NextPermutation.nextPermutation(nums);
		assertArrayEquals(new int[]{1,5,1},nums);
	}
	
	@Test
	public final void testNextPermutation4() {
		int[] nums = {1,2};
		NextPermutation.nextPermutation(nums);
		assertArrayEquals(new int[]{2,1},nums);
	}
	
	@Test
	public final void testNextPermutation5() {
		int[] nums = {1,3,2};
		NextPermutation.nextPermutation(nums);
		assertArrayEquals(new int[]{2,1,3},nums);
	}

}
