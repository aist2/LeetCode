package easy;
import static org.junit.Assert.*;

import org.junit.Test;

import easy.NumArray;


public class NumArrayTest {

	@Test
	public final void testSumRange() {
		int[] nums = {-2, 0, 3, -5, 2, -1};
		NumArray obj = new NumArray(nums);
		assertEquals(1,obj.sumRange(0, 2));
	}

}
