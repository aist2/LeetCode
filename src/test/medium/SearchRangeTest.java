package medium;
import static org.junit.Assert.*;
import medium.SearchRange;

import org.junit.Test;


public class SearchRangeTest {

	@Test
	public final void testSearchRange1() {
		int[] nums = {5, 7, 7, 8, 8, 10};
		int[] expected = {3,4};
		assertArrayEquals(expected, SearchRange.searchRange(nums, 8));
	}
	@Test
	public final void testSearchRange2() {
		int[] nums = {2,2};
		int[] expected = {-1,-1};
		assertArrayEquals(expected, SearchRange.searchRange(nums, 3));
	}

}
