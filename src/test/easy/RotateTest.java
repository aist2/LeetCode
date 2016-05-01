package easy;

import static org.junit.Assert.*;

import org.junit.Test;

import easy.Rotate;


public class RotateTest {

	@Test
	public void testRotate() {
		int[] nums = {1,2,3,4,5,6,7};
		int k = 3;
		int[] base = {5,6,7,1,2,3,4};
		Rotate.rotate(nums, k);
		assertArrayEquals(base,nums);
	}

}
