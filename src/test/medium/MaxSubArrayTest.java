package medium;
import static org.junit.Assert.*;
import medium.MaxSubArray;

import org.junit.Test;


public class MaxSubArrayTest {

	@Test
	public final void testMaxSubArray() {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		assertEquals(6, MaxSubArray.maxSubArray(nums));
	}

}
