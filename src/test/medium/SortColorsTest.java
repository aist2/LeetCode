package medium;
import static org.junit.Assert.*;
import medium.SortColors;

import org.junit.Test;


public class SortColorsTest {

	@Test
	public final void testSortColors() {
		int[] nums = {2,1,0,2,1,0};
		int[] expected = {0,0,1,1,2,2};
		SortColors.sortColors(nums);
		assertArrayEquals(expected, nums);
	}

}
